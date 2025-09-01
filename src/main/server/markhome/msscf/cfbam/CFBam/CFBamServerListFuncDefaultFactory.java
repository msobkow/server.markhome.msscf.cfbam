
// Description: Java 11 Default Factory implementation for ServerListFunc.

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
	 *	CFBamServerListFuncFactory implementation for ServerListFunc
	 */
public class CFBamServerListFuncDefaultFactory
	implements ICFBamServerListFuncFactory
{
	public CFBamServerListFuncDefaultFactory() {
	}

	public CFBamServerListFuncByRetTblIdxKey newRetTblIdxKey() {
		CFBamServerListFuncByRetTblIdxKey key =
			new CFBamServerListFuncByRetTblIdxKey();
		return( key );
	}

	public CFBamServerListFuncBuff newBuff() {
		CFBamServerListFuncBuff buff =
			new CFBamServerListFuncBuff();
		return( buff );
	}

	public CFBamServerListFuncHBuff newHBuff() {
		CFBamServerListFuncHBuff hbuff =
			new CFBamServerListFuncHBuff();
		return( hbuff );
	}
}
