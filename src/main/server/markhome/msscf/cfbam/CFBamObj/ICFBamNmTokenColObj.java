// Description: Java 11 Object interface for CFBam NmTokenCol.

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

public interface ICFBamNmTokenColObj
	extends ICFBamNmTokenDefObj
{
	/**
	 *	Get the current edition of this NmTokenCol instance as a ICFBamNmTokenColEditObj.
	 *
	 *	@return	The ICFBamNmTokenColEditObj edition of this instance.
	 */
	ICFBamNmTokenColEditObj getEditAsNmTokenCol();

	/**
	 *	Get the ICFBamNmTokenColTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamNmTokenColTableObj table cache which manages this instance.
	 */
	ICFBamNmTokenColTableObj getNmTokenColTable();

	/**
	 *	Get the CFBamNmTokenColBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamNmTokenColBuff instance which currently backs this object.
	 */
	CFBamNmTokenColBuff getNmTokenColBuff();

	/**
	 *	Get the required long attribute TableId.
	 *
	 *	@return	The required long attribute TableId.
	 */
	long getRequiredTableId();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the Table key.
	 */
	ICFBamTableObj getRequiredContainerTable();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the Table key.
	 */
	ICFBamTableObj getRequiredContainerTable( boolean forceRead );

}
