
// Description: Java 11 Default Factory implementation for UuidGen.

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
	 *	CFBamUuidGenFactory implementation for UuidGen
	 */
public class CFBamUuidGenDefaultFactory
	implements ICFBamUuidGenFactory
{
	public CFBamUuidGenDefaultFactory() {
	}

	public CFBamUuidGenBuff newBuff() {
		CFBamUuidGenBuff buff =
			new CFBamUuidGenBuff();
		return( buff );
	}

	public CFBamUuidGenHBuff newHBuff() {
		CFBamUuidGenHBuff hbuff =
			new CFBamUuidGenHBuff();
		return( hbuff );
	}
}
