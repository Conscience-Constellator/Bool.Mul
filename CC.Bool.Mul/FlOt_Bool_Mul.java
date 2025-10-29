package CC.Util.Bool;

import CC.Bool.FlOt$Bool;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.$.$Q.Bool_SOrc_List;
import CC.Encycloped.Concept.Bool.BLoopr;
import CC.Encycloped.Concept.Bool.BLoopr_W_List_Havr.BLoopr_W_List_Havr_ConcrEt;
import java.util.List;

public class FlOt_Bool_Mul extends BLoopr_W_List_Havr_ConcrEt<FlOt$Bool> implements FlOt$Bool
{
	public static final Clas_Rap Class=Init_StRt(FlOt_Bool_Mul.class,
		Clas_Rap.class,
		FlOt$Bool.class
	);/*Dep done*/

	@Override
	public boolean FlOt$Bool(float FlOt)
	{
		return Get_BLoopr().$Bool(new Bool_SOrc_List<>(List().iterator())
		{
			@Override
			public boolean $Bool()
			{return next().To_Bool(FlOt);}
		});
	}

	public FlOt_Bool_Mul(BLoopr Boopr,List<FlOt$Bool> List)
	{super(Boopr,List);}
	public FlOt_Bool_Mul(BLoopr Boopr,FlOt$Bool... List)
	{super(Boopr,List);}
	public FlOt_Bool_Mul()
	{}

	static{Init_Nd(FlOt_Bool_Mul.class);}
}