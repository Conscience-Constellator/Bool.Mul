package CC.Util.Bool;

import CC.Bool.Long$Bool_Is;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Concept.Bool.BLoopr;
import CC.Encycloped.Concept.Bool.BLoopr_W_List_Havr.BLoopr_W_List_Havr_ConcrEt;
import CC.$.$Q.Bool_SOrc_List;
import java.util.List;

public class Long_Bool_Mul extends BLoopr_W_List_Havr_ConcrEt<Long$Bool_Is>
	implements Long$Bool_Is
{
	public static final Clas_Rap Class=Init_StRt(Long_Bool_Mul.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Override
	public boolean Long$Bool(long Long)
	{
		return Get_BLoopr().$Bool(
			new Bool_SOrc_List<>(List().iterator())
			{
				@Override
				public boolean $Bool()
				{return next().To_Bool(Long);}
			}
		);
	}

	public Long_Bool_Mul(BLoopr Boopr,List<Long$Bool_Is> List)
	{super(Boopr,List);}
		public Long_Bool_Mul(BLoopr Boopr,Long$Bool_Is... List)
		{super(Boopr,List);}
	public Long_Bool_Mul()
	{}

	static{Init_Nd(Long_Bool_Mul.class);}
}