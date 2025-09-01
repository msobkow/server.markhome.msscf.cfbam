
// Description: Java 11 Default Factory implementation for TimestampDef.

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
	 *	CFBamTimestampDefFactory implementation for TimestampDef
	 */
public class CFBamTimestampDefDefaultFactory
	implements ICFBamTimestampDefFactory
{
	public CFBamTimestampDefDefaultFactory() {
	}

	public CFBamTimestampDefBuff newBuff() {
		CFBamTimestampDefBuff buff =
			new CFBamTimestampDefBuff();
		return( buff );
	}

	public CFBamTimestampDefHBuff newHBuff() {
		CFBamTimestampDefHBuff hbuff =
			new CFBamTimestampDefHBuff();
		return( hbuff );
	}
}
