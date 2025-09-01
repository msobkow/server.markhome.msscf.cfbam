
// Description: Java 11 Default Factory implementation for Id32Gen.

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
	 *	CFBamId32GenFactory implementation for Id32Gen
	 */
public class CFBamId32GenDefaultFactory
	implements ICFBamId32GenFactory
{
	public CFBamId32GenDefaultFactory() {
	}

	public CFBamId32GenByDispIdxKey newDispIdxKey() {
		CFBamId32GenByDispIdxKey key =
			new CFBamId32GenByDispIdxKey();
		return( key );
	}

	public CFBamId32GenBuff newBuff() {
		CFBamId32GenBuff buff =
			new CFBamId32GenBuff();
		return( buff );
	}

	public CFBamId32GenHBuff newHBuff() {
		CFBamId32GenHBuff hbuff =
			new CFBamId32GenHBuff();
		return( hbuff );
	}
}
