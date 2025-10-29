package CC.Util.Bool;

import CC.Bool.Int$Bool;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Concept.Bool.BLoopr;
import CC.Encycloped.Concept.Bool.BLoopr_W_List_Havr.BLoopr_W_List_Havr_ConcrEt;
import CC.$.$Q.Bool_SOrc_List;

public class Int_Bool_Mul extends BLoopr_W_List_Havr_ConcrEt<Int$Bool> implements Int$Bool
{
	public static final Clas_Rap Class=Init_StRt(Int_Bool_Mul.class
		,Clas_Rap.class
		,Int$Bool.class
	);/*Dep ?done*/

	@Override
	public boolean Int$Bool(int Int)
	{
		return Get_BLoopr().$Bool(new Bool_SOrc_List<>(List().iterator())
		{
			@Override
			public boolean $Bool()
			{return next().To_Bool(Int);}
		});
	}

	public Int_Bool_Mul(BLoopr Boopr,Int$Bool List)
	{super(Boopr,List);}
		public Int_Bool_Mul(BLoopr Boopr,Int$Bool... List)
		{super(Boopr,List);}
	public Int_Bool_Mul()
	{}

	static{Init_Nd(Int_Bool_Mul.class);}
}