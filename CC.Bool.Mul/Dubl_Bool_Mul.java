package CC.Util.Bool;

import CC.Bool.Dubl$Bool;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Concept.Bool.BLoopr;
import CC.Encycloped.Concept.Bool.BLoopr_W_List_Havr.BLoopr_W_List_Havr_ConcrEt;
import CC.$.$Q.Bool_SOrc_List;
import java.util.List;

public class Dubl_Bool_Mul extends BLoopr_W_List_Havr_ConcrEt<Dubl$Bool> implements Dubl$Bool
{
	public static final Clas_Rap Class=Init_StRt(Dubl_Bool_Mul.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Override public boolean To_Bool(double Dubl)
	{
		return Get_BLoopr().$Bool(new Bool_SOrc_List<>(List().iterator())
		{
			@Override
			public boolean $Bool()
			{return next().To_Bool(Dubl);}
		});
	}

	public Dubl_Bool_Mul(BLoopr Boopr,List<Dubl$Bool> List)
	{super(Boopr,List);}
		public Dubl_Bool_Mul(BLoopr Boopr,Dubl$Bool... List)
		{super(Boopr,List);}
	public Dubl_Bool_Mul()
	{}

	static{Init_Nd(Dubl_Bool_Mul.class);}
}