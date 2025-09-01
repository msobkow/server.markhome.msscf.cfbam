
// Description: Java 11 Factory interface for ClearTopDep.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

/*
 *	CFBamClearTopDepFactory interface for ClearTopDep
 */
public interface ICFBamClearTopDepFactory
{

	/**
	 *	Allocate a ClrTopDepTblIdx key over ClearTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearTopDepByClrTopDepTblIdxKey newClrTopDepTblIdxKey();

	/**
	 *	Allocate a UNameIdx key over ClearTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearTopDepByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a PrevIdx key over ClearTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearTopDepByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over ClearTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearTopDepByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a ClearTopDep instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearTopDepBuff newBuff();

	/**
	 *	Allocate a ClearTopDep history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearTopDepHBuff newHBuff();

}
