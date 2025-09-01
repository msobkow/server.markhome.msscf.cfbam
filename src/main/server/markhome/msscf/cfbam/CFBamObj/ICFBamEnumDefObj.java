// Description: Java 11 Object interface for CFBam EnumDef.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import server.markhome.msscf.cfbam.CFBam.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamEnumDefObj
	extends ICFBamInt16DefObj
{
	/**
	 *	Get the current edition of this EnumDef instance as a ICFBamEnumDefEditObj.
	 *
	 *	@return	The ICFBamEnumDefEditObj edition of this instance.
	 */
	ICFBamEnumDefEditObj getEditAsEnumDef();

	/**
	 *	Get the ICFBamEnumDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamEnumDefTableObj table cache which manages this instance.
	 */
	ICFBamEnumDefTableObj getEnumDefTable();

	/**
	 *	Get the CFBamEnumDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamEnumDefBuff instance which currently backs this object.
	 */
	CFBamEnumDefBuff getEnumDefBuff();

	/**
	 *	Get the array of required ICFBamEnumTagObj array of instances referenced by the Tag key.
	 *
	 *	@return	The required ICFBamEnumTagObj[] array of instances referenced by the Tag key.
	 */
	List<ICFBamEnumTagObj> getRequiredComponentsTag();

	/**
	 *	Get the array of required ICFBamEnumTagObj array of instances referenced by the Tag key.
	 *
	 *	@return	The required ICFBamEnumTagObj[] array of instances referenced by the Tag key.
	 */
	List<ICFBamEnumTagObj> getRequiredComponentsTag( boolean forceRead );

}
