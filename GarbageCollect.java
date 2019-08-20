
public class GarbageCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GarbageCollect g=new GarbageCollect();
			Runtime rs=Runtime.getRuntime();
			System.out.println(rs.freeMemory());
			System.out.println("....freed....");
			//rs.freeMemory();
			rs.gc();
			System.out.println(rs.freeMemory());
	}

}
