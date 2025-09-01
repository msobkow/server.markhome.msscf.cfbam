// Description: Java 11 Object interface for CFBam ServerObjFunc.

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

public interface ICFBamServerObjFuncObj
	extends ICFBamServerMethodObj
{
	/**
	 *	Get the current edition of this ServerObjFunc instance as a ICFBamServerObjFuncEditObj.
	 *
	 *	@return	The ICFBamServerObjFuncEditObj edition of this instance.
	 */
	ICFBamServerObjFuncEditObj getEditAsServerObjFunc();

	/**
	 *	Get the ICFBamServerObjFuncTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamServerObjFuncTableObj table cache which manages this instance.
	 */
	ICFBamServerObjFuncTableObj getServerObjFuncTable();

	/**
	 *	Get the CFBamServerObjFuncBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamServerObjFuncBuff instance which currently backs this object.
	 */
	CFBamServerObjFuncBuff getServerObjFuncBuff();

	/**
	 *	Get the optional Long attribute RetTenantId.
	 *
	 *	@return	The optional Long attribute RetTenantId.
	 */
	Long getOptionalRetTenantId();

	/**
	 *	Get the optional Long attribute RetTableId.
	 *
	 *	@return	The optional Long attribute RetTableId.
	 */
	Long getOptionalRetTableId();

	/**
	 *	Get the optional ICFBamTableObj instance referenced by the RetTable key.
	 *
	 *	@return	The optional ICFBamTableObj instance referenced by the RetTable key.
	 */
	ICFBamTableObj getOptionalLookupRetTable();

	/**
	 *	Get the optional ICFBamTableObj instance referenced by the RetTable key.
	 *
	 *	@return	The optional ICFBamTableObj instance referenced by the RetTable key.
	 */
	ICFBamTableObj getOptionalLookupRetTable( boolean forceRead );

}
