
// Description: Java 11 Default Factory implementation for UInt16Col.

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
	 *	CFBamUInt16ColFactory implementation for UInt16Col
	 */
public class CFBamUInt16ColDefaultFactory
	implements ICFBamUInt16ColFactory
{
	public CFBamUInt16ColDefaultFactory() {
	}

	public CFBamUInt16ColByTableIdxKey newTableIdxKey() {
		CFBamUInt16ColByTableIdxKey key =
			new CFBamUInt16ColByTableIdxKey();
		return( key );
	}

	public CFBamUInt16ColBuff newBuff() {
		CFBamUInt16ColBuff buff =
			new CFBamUInt16ColBuff();
		return( buff );
	}

	public CFBamUInt16ColHBuff newHBuff() {
		CFBamUInt16ColHBuff hbuff =
			new CFBamUInt16ColHBuff();
		return( hbuff );
	}
}
