
// Description: Java 11 Default Factory implementation for NmTokenDef.

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
	 *	CFBamNmTokenDefFactory implementation for NmTokenDef
	 */
public class CFBamNmTokenDefDefaultFactory
	implements ICFBamNmTokenDefFactory
{
	public CFBamNmTokenDefDefaultFactory() {
	}

	public CFBamNmTokenDefBuff newBuff() {
		CFBamNmTokenDefBuff buff =
			new CFBamNmTokenDefBuff();
		return( buff );
	}

	public CFBamNmTokenDefHBuff newHBuff() {
		CFBamNmTokenDefHBuff hbuff =
			new CFBamNmTokenDefHBuff();
		return( hbuff );
	}
}
