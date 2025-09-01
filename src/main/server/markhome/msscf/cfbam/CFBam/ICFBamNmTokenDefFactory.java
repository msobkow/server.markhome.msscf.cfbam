
// Description: Java 11 Factory interface for NmTokenDef.

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
 *	CFBamNmTokenDefFactory interface for NmTokenDef
 */
public interface ICFBamNmTokenDefFactory
{

	/**
	 *	Allocate a NmTokenDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokenDefBuff newBuff();

	/**
	 *	Allocate a NmTokenDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokenDefHBuff newHBuff();

}
