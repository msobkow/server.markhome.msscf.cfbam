// Description: Java 11 Object interface for CFBam UInt64Def.

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

public interface ICFBamUInt64DefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this UInt64Def instance as a ICFBamUInt64DefEditObj.
	 *
	 *	@return	The ICFBamUInt64DefEditObj edition of this instance.
	 */
	ICFBamUInt64DefEditObj getEditAsUInt64Def();

	/**
	 *	Get the ICFBamUInt64DefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamUInt64DefTableObj table cache which manages this instance.
	 */
	ICFBamUInt64DefTableObj getUInt64DefTable();

	/**
	 *	Get the CFBamUInt64DefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamUInt64DefBuff instance which currently backs this object.
	 */
	CFBamUInt64DefBuff getUInt64DefBuff();

	/**
	 *	Get the optional BigDecimal attribute InitValue.
	 *
	 *	@return	The optional BigDecimal attribute InitValue.
	 */
	BigDecimal getOptionalInitValue();

	/**
	 *	Get the optional BigDecimal attribute MinValue.
	 *
	 *	@return	The optional BigDecimal attribute MinValue.
	 */
	BigDecimal getOptionalMinValue();

	/**
	 *	Get the optional BigDecimal attribute MaxValue.
	 *
	 *	@return	The optional BigDecimal attribute MaxValue.
	 */
	BigDecimal getOptionalMaxValue();

}
