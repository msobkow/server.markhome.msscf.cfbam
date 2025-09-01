// Description: Java 11 Object interface for CFBam NumberDef.

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

public interface ICFBamNumberDefObj
	extends ICFBamAtomObj
{
	/**
	 *	Get the current edition of this NumberDef instance as a ICFBamNumberDefEditObj.
	 *
	 *	@return	The ICFBamNumberDefEditObj edition of this instance.
	 */
	ICFBamNumberDefEditObj getEditAsNumberDef();

	/**
	 *	Get the ICFBamNumberDefTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamNumberDefTableObj table cache which manages this instance.
	 */
	ICFBamNumberDefTableObj getNumberDefTable();

	/**
	 *	Get the CFBamNumberDefBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamNumberDefBuff instance which currently backs this object.
	 */
	CFBamNumberDefBuff getNumberDefBuff();

	/**
	 *	Get the required short attribute Digits.
	 *
	 *	@return	The required short attribute Digits.
	 */
	short getRequiredDigits();

	/**
	 *	Get the required short attribute Precis.
	 *
	 *	@return	The required short attribute Precis.
	 */
	short getRequiredPrecis();

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
