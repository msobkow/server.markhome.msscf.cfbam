// Description: Java 11 edit object instance implementation for CFBam PopSubDep1.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public class CFBamPopSubDep1EditObj
	extends CFBamPopDepEditObj

	implements ICFBamPopSubDep1EditObj
{
	protected ICFBamPopTopDepObj requiredContainerContPopTopDep;

	public CFBamPopSubDep1EditObj( ICFBamPopSubDep1Obj argOrig ) {
		super( argOrig );
		requiredContainerContPopTopDep = null;
	}

	public String getClassCode() {
		return( CFBamPopSubDep1Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "PopSubDep1" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamPopTopDepObj scope = getRequiredContainerContPopTopDep();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamPopTopDepObj scope = getRequiredContainerContPopTopDep();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public ICFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamPopSubDep1Obj retobj = getSchema().getPopSubDep1TableObj().realisePopSubDep1( (ICFBamPopSubDep1Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsPopSubDep1().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamPopSubDep1Obj retobj = ((ICFBamSchemaObj)getOrigAsPopSubDep1().getSchema()).getPopSubDep1TableObj().createPopSubDep1( getOrigAsPopSubDep1() );
		if( retobj == getOrigAsPopSubDep1() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getPopSubDep1TableObj().updatePopSubDep1( (ICFBamPopSubDep1Obj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getPopSubDep1TableObj().deletePopSubDep1( getOrigAsPopSubDep1() );
		return( null );
	}

	public ICFBamPopSubDep1TableObj getPopSubDep1Table() {
		return( orig.getSchema().getPopSubDep1TableObj() );
	}

	public ICFBamPopSubDep1EditObj getEditAsPopSubDep1() {
		return( (ICFBamPopSubDep1EditObj)this );
	}

	public ICFBamPopSubDep1Obj getOrigAsPopSubDep1() {
		return( (ICFBamPopSubDep1Obj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsPopSubDep1().getSchema().getBackingStore()).getFactoryPopSubDep1().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerContPopTopDep = null;
		}
	}

	public CFBamPopSubDep1Buff getPopSubDep1Buff() {
		return( (CFBamPopSubDep1Buff)getBuff() );
	}

	public long getRequiredPopTopDepTenantId() {
		return( getPopSubDep1Buff().getRequiredPopTopDepTenantId() );
	}

	public long getRequiredPopTopDepId() {
		return( getPopSubDep1Buff().getRequiredPopTopDepId() );
	}

	public String getRequiredName() {
		return( getPopSubDep1Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getPopSubDep1Buff().getRequiredName() != value ) {
			getPopSubDep1Buff().setRequiredName( value );
		}
	}

	public ICFBamPopTopDepObj getRequiredContainerContPopTopDep() {
		return( getRequiredContainerContPopTopDep( false ) );
	}

	public ICFBamPopTopDepObj getRequiredContainerContPopTopDep( boolean forceRead ) {
		if( forceRead || ( requiredContainerContPopTopDep == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamPopTopDepObj obj = ((ICFBamSchemaObj)getOrigAsPopSubDep1().getSchema()).getPopTopDepTableObj().readPopTopDepByIdIdx( getPopSubDep1Buff().getRequiredPopTopDepTenantId(),
					getPopSubDep1Buff().getRequiredPopTopDepId() );
				requiredContainerContPopTopDep = obj;
				if( obj != null ) {
					getPopSubDep1Buff().setRequiredPopTopDepTenantId( obj.getRequiredTenantId() );
					getPopSubDep1Buff().setRequiredPopTopDepId( obj.getRequiredId() );
					requiredContainerContPopTopDep = obj;
				}
			}
		}
		return( requiredContainerContPopTopDep );
	}

	public void setRequiredContainerContPopTopDep( ICFBamPopTopDepObj value ) {
			if( buff == null ) {
				getPopSubDep1Buff();
			}
			if( value != null ) {
				getPopSubDep1Buff().setRequiredPopTopDepTenantId( value.getRequiredTenantId() );
				getPopSubDep1Buff().setRequiredPopTopDepId( value.getRequiredId() );
			}
			requiredContainerContPopTopDep = value;
	}

	public List<ICFBamPopSubDep2Obj> getOptionalComponentsPopDep() {
		List<ICFBamPopSubDep2Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsPopSubDep1().getSchema()).getPopSubDep2TableObj().readPopSubDep2ByPopSubDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamPopSubDep2Obj> getOptionalComponentsPopDep( boolean forceRead ) {
		List<ICFBamPopSubDep2Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsPopSubDep1().getSchema()).getPopSubDep2TableObj().readPopSubDep2ByPopSubDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		CFBamPopSubDep1Buff origBuff = getOrigAsPopSubDep1().getPopSubDep1Buff();
		CFBamPopSubDep1Buff myBuff = getPopSubDep1Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamPopSubDep1Buff origBuff = getOrigAsPopSubDep1().getPopSubDep1Buff();
		CFBamPopSubDep1Buff myBuff = getPopSubDep1Buff();
		myBuff.set( origBuff );
	}
}
