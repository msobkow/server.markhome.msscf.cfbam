
// Description: Java 11 Factory interface for NmTokensDef.

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
 *	CFBamNmTokensDefFactory interface for NmTokensDef
 */
public interface ICFBamNmTokensDefFactory
{

	/**
	 *	Allocate a NmTokensDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokensDefBuff newBuff();

	/**
	 *	Allocate a NmTokensDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokensDefHBuff newHBuff();

}
