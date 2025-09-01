
// Description: Java 11 Default Factory implementation for Id16Gen.

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
	 *	CFBamId16GenFactory implementation for Id16Gen
	 */
public class CFBamId16GenDefaultFactory
	implements ICFBamId16GenFactory
{
	public CFBamId16GenDefaultFactory() {
	}

	public CFBamId16GenByDispIdxKey newDispIdxKey() {
		CFBamId16GenByDispIdxKey key =
			new CFBamId16GenByDispIdxKey();
		return( key );
	}

	public CFBamId16GenBuff newBuff() {
		CFBamId16GenBuff buff =
			new CFBamId16GenBuff();
		return( buff );
	}

	public CFBamId16GenHBuff newHBuff() {
		CFBamId16GenHBuff hbuff =
			new CFBamId16GenHBuff();
		return( hbuff );
	}
}
