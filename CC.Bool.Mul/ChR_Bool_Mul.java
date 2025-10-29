package CC.Util.Bool;

import CC.Bool.ChR$Bool;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Concept.Bool.BLoopr_W_List_Havr.BLoopr_W_List_Havr_ConcrEt;
import CC.Encycloped.Concept.Bool.BLoopr;
import CC.$.$Q.Bool_SOrc_List;
import java.util.List;

public class ChR_Bool_Mul extends BLoopr_W_List_Havr_ConcrEt<ChR$Bool> implements ChR$Bool
{
	public static final Clas_Rap Class=Init_StRt(ChR_Bool_Mul.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public ChR_Bool_Mul(BLoopr Boopr,List<ChR$Bool> List){super(Boopr,List);}
		public ChR_Bool_Mul(BLoopr BLoopr,ChR$Bool... List){super(BLoopr,List);}
	public ChR_Bool_Mul(){}

	@Override
	public boolean To_Bool(char ChR)
	{
		return Get_BLoopr().$Bool(new Bool_SOrc_List<>(List().iterator())
		{
			@Override public boolean $Bool()
			{return next().To_Bool(ChR);}
		});
	}

	static{Init_Nd(ChR_Bool_Mul.class);}
}