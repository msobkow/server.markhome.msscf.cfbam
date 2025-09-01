
// Description: Java 11 Default Factory implementation for Int16Col.

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
	 *	CFBamInt16ColFactory implementation for Int16Col
	 */
public class CFBamInt16ColDefaultFactory
	implements ICFBamInt16ColFactory
{
	public CFBamInt16ColDefaultFactory() {
	}

	public CFBamInt16ColByTableIdxKey newTableIdxKey() {
		CFBamInt16ColByTableIdxKey key =
			new CFBamInt16ColByTableIdxKey();
		return( key );
	}

	public CFBamInt16ColBuff newBuff() {
		CFBamInt16ColBuff buff =
			new CFBamInt16ColBuff();
		return( buff );
	}

	public CFBamInt16ColHBuff newHBuff() {
		CFBamInt16ColHBuff hbuff =
			new CFBamInt16ColHBuff();
		return( hbuff );
	}
}
