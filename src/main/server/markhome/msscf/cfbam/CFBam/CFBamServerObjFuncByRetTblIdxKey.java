// Description: Java 11 implementation of a ServerObjFunc by RetTblIdx index key object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

public class CFBamServerObjFuncByRetTblIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalRetTenantId;
	protected Long optionalRetTableId;
	public CFBamServerObjFuncByRetTblIdxKey() {
		optionalRetTenantId = null;
		optionalRetTableId = null;
	}

	public Long getOptionalRetTenantId() {
		return( optionalRetTenantId );
	}

	public void setOptionalRetTenantId( Long value ) {
		if( value == null ) {
			optionalRetTenantId = null;
		}
		else if( value < CFBamServerObjFuncBuff.RETTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalRetTenantId",
				1,
				"value",
				value,
				CFBamServerObjFuncBuff.RETTENANTID_MIN_VALUE );
		}
		else {
			optionalRetTenantId = value;
		}
	}

	public Long getOptionalRetTableId() {
		return( optionalRetTableId );
	}

	public void setOptionalRetTableId( Long value ) {
		if( value == null ) {
			optionalRetTableId = null;
		}
		else if( value < CFBamServerObjFuncBuff.RETTABLEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalRetTableId",
				1,
				"value",
				value,
				CFBamServerObjFuncBuff.RETTABLEID_MIN_VALUE );
		}
		else {
			optionalRetTableId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamServerObjFuncByRetTblIdxKey ) {
			CFBamServerObjFuncByRetTblIdxKey rhs = (CFBamServerObjFuncByRetTblIdxKey)obj;
			if( getOptionalRetTenantId() != null ) {
				if( rhs.getOptionalRetTenantId() != null ) {
					if( ! getOptionalRetTenantId().equals( rhs.getOptionalRetTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRetTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalRetTableId() != null ) {
				if( rhs.getOptionalRetTableId() != null ) {
					if( ! getOptionalRetTableId().equals( rhs.getOptionalRetTableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamServerObjFuncBuff ) {
			CFBamServerObjFuncBuff rhs = (CFBamServerObjFuncBuff)obj;
			if( getOptionalRetTenantId() != null ) {
				if( rhs.getOptionalRetTenantId() != null ) {
					if( ! getOptionalRetTenantId().equals( rhs.getOptionalRetTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRetTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalRetTableId() != null ) {
				if( rhs.getOptionalRetTableId() != null ) {
					if( ! getOptionalRetTableId().equals( rhs.getOptionalRetTableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getOptionalRetTenantId() != null ) {
			hashCode = hashCode + getOptionalRetTenantId().hashCode();
		}
		if( getOptionalRetTableId() != null ) {
			hashCode = hashCode + getOptionalRetTableId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamServerObjFuncByRetTblIdxKey ) {
			CFBamServerObjFuncByRetTblIdxKey rhs = (CFBamServerObjFuncByRetTblIdxKey)obj;
			if( getOptionalRetTenantId() != null ) {
				Long lhsRetTenantId = getOptionalRetTenantId();
				if( rhs.getOptionalRetTenantId() != null ) {
					Long rhsRetTenantId = rhs.getOptionalRetTenantId();
					int cmp = lhsRetTenantId.compareTo( rhsRetTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRetTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalRetTableId() != null ) {
				Long lhsRetTableId = getOptionalRetTableId();
				if( rhs.getOptionalRetTableId() != null ) {
					Long rhsRetTableId = rhs.getOptionalRetTableId();
					int cmp = lhsRetTableId.compareTo( rhsRetTableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamServerObjFuncBuff ) {
			CFBamServerObjFuncBuff rhs = (CFBamServerObjFuncBuff)obj;
			if( getOptionalRetTenantId() != null ) {
				Long lhsRetTenantId = getOptionalRetTenantId();
				if( rhs.getOptionalRetTenantId() != null ) {
					Long rhsRetTenantId = rhs.getOptionalRetTenantId();
					int cmp = lhsRetTenantId.compareTo( rhsRetTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRetTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalRetTableId() != null ) {
				Long lhsRetTableId = getOptionalRetTableId();
				if( rhs.getOptionalRetTableId() != null ) {
					Long rhsRetTableId = rhs.getOptionalRetTableId();
					int cmp = lhsRetTableId.compareTo( rhsRetTableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRetTableId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFBamServerObjFuncByRetTblIdx"
			+ " OptionalRetTenantId=" + ( ( getOptionalRetTenantId() == null ) ? "null" : "\"" + getOptionalRetTenantId().toString() + "\"" )
			+ " OptionalRetTableId=" + ( ( getOptionalRetTableId() == null ) ? "null" : "\"" + getOptionalRetTableId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
