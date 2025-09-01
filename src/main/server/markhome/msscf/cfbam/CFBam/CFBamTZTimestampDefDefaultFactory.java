
// Description: Java 11 Default Factory implementation for TZTimestampDef.

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
	 *	CFBamTZTimestampDefFactory implementation for TZTimestampDef
	 */
public class CFBamTZTimestampDefDefaultFactory
	implements ICFBamTZTimestampDefFactory
{
	public CFBamTZTimestampDefDefaultFactory() {
	}

	public CFBamTZTimestampDefBuff newBuff() {
		CFBamTZTimestampDefBuff buff =
			new CFBamTZTimestampDefBuff();
		return( buff );
	}

	public CFBamTZTimestampDefHBuff newHBuff() {
		CFBamTZTimestampDefHBuff hbuff =
			new CFBamTZTimestampDefHBuff();
		return( hbuff );
	}
}
