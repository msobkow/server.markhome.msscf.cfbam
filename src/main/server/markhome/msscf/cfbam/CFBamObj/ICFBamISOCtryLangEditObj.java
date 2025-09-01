// Description: Java 11 Instance Edit Object interface for CFBam ISOCtryLang.

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
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamISOCtryLangEditObj
	extends ICFBamISOCtryLangObj,
		ICFSecISOCtryLangEditObj,
		ICFIntISOCtryLangEditObj
{
	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecISOCtryLangObj create();

	/*
	 *	Update the instance.
	 */
	CFSecISOCtryLangEditObj update();

	/**
	 *	Get the ICFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The ICFSecISOCtryObj instance referenced by the Ctry key.
	 */
	ICFSecISOCtryObj getRequiredContainerCtry();

	/**
	 *	Set the ICFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@param	value	the ICFSecISOCtryObj instance to be referenced by the Ctry key.
	 */
	void setRequiredContainerCtry( ICFSecISOCtryObj value );

	/**
	 *	Get the ICFSecISOLangObj instance referenced by the Lang key.
	 *
	 *	@return	The ICFSecISOLangObj instance referenced by the Lang key.
	 */
	ICFSecISOLangObj getRequiredParentLang();

	/**
	 *	Set the ICFSecISOLangObj instance referenced by the Lang key.
	 *
	 *	@param	value	the ICFSecISOLangObj instance to be referenced by the Lang key.
	 */
	void setRequiredParentLang( ICFSecISOLangObj value );
}
