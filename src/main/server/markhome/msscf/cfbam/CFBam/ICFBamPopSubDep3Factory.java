
// Description: Java 11 Factory interface for PopSubDep3.

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
 *	CFBamPopSubDep3Factory interface for PopSubDep3
 */
public interface ICFBamPopSubDep3Factory
{

	/**
	 *	Allocate a PopSubDep2Idx key over PopSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep3ByPopSubDep2IdxKey newPopSubDep2IdxKey();

	/**
	 *	Allocate a UNameIdx key over PopSubDep3 instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep3ByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a PopSubDep3 instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep3Buff newBuff();

	/**
	 *	Allocate a PopSubDep3 history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopSubDep3HBuff newHBuff();

}
