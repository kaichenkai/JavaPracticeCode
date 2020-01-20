package utils;

/**
 * 分页类
 */
public class Page {
    private int start;
    private int count;
    private int total;

    // 构造方法
    public Page(int start, int count){
        super();
        this.setStart(start);
        this.setCount(count);
    }

    // 获取总页数
    public int getTotalPage(){
        int totalPage;
        //
        if (total % count == 0){
            // 能整除
            totalPage = total/count;
        } else {
            // 不能整除
            totalPage = total/count + 1;
        }
        //
        if (totalPage == 0) {
            totalPage = 1;
        }
        return totalPage;
    }

    // 获取最后一页数据开始
    public int getLast(){
        int last;
        if (total % count == 0){
            // 假设总数是 50, 能够被 10 整除, 那么最后一页的开始就是 40
            last = total - count;
        } else {
            // 假设总数是51，不能够被 10 整除的，那么最后一页的开始就是50
            last = total - total % count;
        }
        // 数据数据不足一页
        last = last < 0? 0:last;
        return last;
    }

    // 是否有上一页
    public boolean isHasPreviouse(){
        if (start==0) {
            return false;
        } else {
            return true;
        }
    }
    // 是否有下一页
    public boolean isHasNext(){
        if (start == getLast()) {
            return false;
        } else{
            return true;
        }
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
