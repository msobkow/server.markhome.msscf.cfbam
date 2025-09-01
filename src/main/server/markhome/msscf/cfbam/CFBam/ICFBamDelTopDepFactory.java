
// Description: Java 11 Factory interface for DelTopDep.

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
 *	CFBamDelTopDepFactory interface for DelTopDep
 */
public interface ICFBamDelTopDepFactory
{

	/**
	 *	Allocate a DelTopDepTblIdx key over DelTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelTopDepByDelTopDepTblIdxKey newDelTopDepTblIdxKey();

	/**
	 *	Allocate a UNameIdx key over DelTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelTopDepByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a PrevIdx key over DelTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelTopDepByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over DelTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelTopDepByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a DelTopDep instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelTopDepBuff newBuff();

	/**
	 *	Allocate a DelTopDep history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelTopDepHBuff newHBuff();

}
