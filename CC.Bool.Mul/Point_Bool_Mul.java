package CC.Util.Bool;

import CC.Bool.Point_Bool;
import CC.Encycloped.Concept.Bool.BLoopr;
import CC.Encycloped.Concept.Bool.BLoopr_W_List_Havr.BLoopr_W_List_Havr_ConcrEt;
import CC.$.$Q.Bool_SOrc_List;
import java.util.List;

public class Point_Bool_Mul<Typ>
	extends BLoopr_W_List_Havr_ConcrEt<Point_Bool<Typ>>
	implements Point_Bool<Typ>
{
//	public static final Clas_Rap Class=Init_StRt(Point_Bool_Mul.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	@Override
	public boolean Point$Bool(Typ Point)
	{return Get_BLoopr().$Bool(new Bool_SOrc_List<>(List.iterator())
	{@Override
	public boolean $Bool()
	{return next().To_Bool(Point);}});}

	public Point_Bool_Mul(BLoopr BLoopr,List<Point_Bool<Typ>> List)
	{super(BLoopr,List);}
		public Point_Bool_Mul(BLoopr BLoopr,Point_Bool<Typ>... List)
		{super(BLoopr,List);}
	public Point_Bool_Mul()
	{}

//	static{Init_Nd(Point_Bool_Mul.class);}
}