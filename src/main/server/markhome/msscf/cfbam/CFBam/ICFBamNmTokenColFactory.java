
// Description: Java 11 Factory interface for NmTokenCol.

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
 *	CFBamNmTokenColFactory interface for NmTokenCol
 */
public interface ICFBamNmTokenColFactory
{

	/**
	 *	Allocate a TableIdx key over NmTokenCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokenColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a NmTokenCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokenColBuff newBuff();

	/**
	 *	Allocate a NmTokenCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokenColHBuff newHBuff();

}
