public class Store {
    int[] INN_list = {12,13,14,15};
    public boolean buy(int id, String name, int INN) throws INNExeption {
        for (int INN_licvid: INN_list){
            if (INN_licvid == INN){
                return true;
            }
        }
        throw new INNExeption();
    }
}
