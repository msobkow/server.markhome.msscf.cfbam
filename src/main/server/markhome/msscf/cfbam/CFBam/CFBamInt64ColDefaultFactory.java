
// Description: Java 11 Default Factory implementation for Int64Col.

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
	 *	CFBamInt64ColFactory implementation for Int64Col
	 */
public class CFBamInt64ColDefaultFactory
	implements ICFBamInt64ColFactory
{
	public CFBamInt64ColDefaultFactory() {
	}

	public CFBamInt64ColByTableIdxKey newTableIdxKey() {
		CFBamInt64ColByTableIdxKey key =
			new CFBamInt64ColByTableIdxKey();
		return( key );
	}

	public CFBamInt64ColBuff newBuff() {
		CFBamInt64ColBuff buff =
			new CFBamInt64ColBuff();
		return( buff );
	}

	public CFBamInt64ColHBuff newHBuff() {
		CFBamInt64ColHBuff hbuff =
			new CFBamInt64ColHBuff();
		return( hbuff );
	}
}
