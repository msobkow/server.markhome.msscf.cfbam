// Description: Java 11 Object interface for CFBam Int64Def.

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

public interface ICFBamInt64DefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this Int64Def instance as a ICFBamInt64DefEditObj.
	 *
	 *	@return	The ICFBamInt64DefEditObj edition of this instance.
	 */
	ICFBamInt64DefEditObj getEditAsInt64Def();

	/**
	 *	Get the ICFBamInt64DefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamInt64DefTableObj table cache which manages this instance.
	 */
	ICFBamInt64DefTableObj getInt64DefTable();

	/**
	 *	Get the CFBamInt64DefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamInt64DefBuff instance which currently backs this object.
	 */
	CFBamInt64DefBuff getInt64DefBuff();

	/**
	 *	Get the optional Long attribute InitValue.
	 *
	 *	@return	The optional Long attribute InitValue.
	 */
	Long getOptionalInitValue();

	/**
	 *	Get the optional Long attribute MinValue.
	 *
	 *	@return	The optional Long attribute MinValue.
	 */
	Long getOptionalMinValue();

	/**
	 *	Get the optional Long attribute MaxValue.
	 *
	 *	@return	The optional Long attribute MaxValue.
	 */
	Long getOptionalMaxValue();

}
