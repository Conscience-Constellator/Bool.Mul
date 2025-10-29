package CC.Util.Bool;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Concept.Bool.BLoopr;
import CC.Encycloped.Concept.Bool.BLoopr_W_List_Havr.BLoopr_W_List_Havr_ConcrEt;
import CC.$.$Q.Bool_SOrc_List;
import java.util.List;

public class Bool_Bool_Mul
	extends BLoopr_W_List_Havr_ConcrEt<Bool1$1>
	implements Bool1$1
{
	/*
	public static final Clas_Rap Class=Init_StRt(Bool_Bool_Mul.class,
		Clas_Rap.class,
		Bool_To_Bool.class);
	/*Dep done*/

	@Override
	public boolean Bool1$1(boolean Bool)
	{
		return Get_BLoopr().$Bool(new Bool_SOrc_List<>(List().iterator())
			{
				@Override public boolean $Bool()
				{return next().To_Bool(Bool);}
			});
	}

	public Bool_Bool_Mul(BLoopr Boopr,List<Bool1$1> List)
	{super(Boopr,List);}
		public Bool_Bool_Mul(BLoopr Boopr,Bool1$1... List)
		{super(Boopr,List);}
	public Bool_Bool_Mul()
	{}

//	static{Init_Nd(Bool_Bool_Mul.class);}
}