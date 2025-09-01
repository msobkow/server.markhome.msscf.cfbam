
// Description: Java 11 Default Factory implementation for Id64Gen.

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
	 *	CFBamId64GenFactory implementation for Id64Gen
	 */
public class CFBamId64GenDefaultFactory
	implements ICFBamId64GenFactory
{
	public CFBamId64GenDefaultFactory() {
	}

	public CFBamId64GenByDispIdxKey newDispIdxKey() {
		CFBamId64GenByDispIdxKey key =
			new CFBamId64GenByDispIdxKey();
		return( key );
	}

	public CFBamId64GenBuff newBuff() {
		CFBamId64GenBuff buff =
			new CFBamId64GenBuff();
		return( buff );
	}

	public CFBamId64GenHBuff newHBuff() {
		CFBamId64GenHBuff hbuff =
			new CFBamId64GenHBuff();
		return( hbuff );
	}
}
