// Description: Java 11 Table Object implementation for CFBam.

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

public class CFBamPopSubDep2TableObj
	implements ICFBamPopSubDep2TableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamPopSubDep2Obj> members;
	private Map<CFBamScopePKey, ICFBamPopSubDep2Obj> allPopSubDep2;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamPopSubDep2Obj > > indexByTenantIdx;
	private Map< CFBamPopDepByRelationIdxKey,
		Map<CFBamScopePKey, ICFBamPopSubDep2Obj > > indexByRelationIdx;
	private Map< CFBamPopDepByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamPopSubDep2Obj > > indexByDefSchemaIdx;
	private Map< CFBamPopSubDep2ByPopSubDep1IdxKey,
		Map<CFBamScopePKey, ICFBamPopSubDep2Obj > > indexByPopSubDep1Idx;
	private Map< CFBamPopSubDep2ByUNameIdxKey,
		ICFBamPopSubDep2Obj > indexByUNameIdx;
	public static String TABLE_NAME = "PopSubDep2";
	public static String TABLE_DBNAME = "popsubdep2";

	public CFBamPopSubDep2TableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamPopSubDep2Obj>();
		allPopSubDep2 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep1Idx = null;
		indexByUNameIdx = null;
	}

	public CFBamPopSubDep2TableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamPopSubDep2Obj>();
		allPopSubDep2 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep1Idx = null;
		indexByUNameIdx = null;
	}

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allPopSubDep2 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep1Idx = null;
		indexByUNameIdx = null;
		List<ICFBamPopSubDep2Obj> toForget = new LinkedList<ICFBamPopSubDep2Obj>();
		ICFBamPopSubDep2Obj cur = null;
		Iterator<ICFBamPopSubDep2Obj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamPopSubDep2Obj.
	 */
	public ICFBamPopSubDep2Obj newInstance() {
		ICFBamPopSubDep2Obj inst = new CFBamPopSubDep2Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamPopSubDep2Obj.
	 */
	public ICFBamPopSubDep2EditObj newEditInstance( ICFBamPopSubDep2Obj orig ) {
		ICFBamPopSubDep2EditObj edit = new CFBamPopSubDep2EditObj( orig );
		return( edit );
	}

	public ICFBamPopSubDep2Obj realisePopSubDep2( ICFBamPopSubDep2Obj Obj ) {
		ICFBamPopSubDep2Obj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamPopSubDep2Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamPopSubDep2Obj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByRelationIdx != null ) {
				CFBamPopDepByRelationIdxKey keyRelationIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					indexByRelationIdx.remove( keyRelationIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPopSubDep1Idx != null ) {
				CFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
				keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyPopSubDep1Idx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapPopSubDep1Idx = indexByPopSubDep1Idx.get( keyPopSubDep1Idx );
				if( mapPopSubDep1Idx != null ) {
					mapPopSubDep1Idx.remove( keepObj.getPKey() );
					if( mapPopSubDep1Idx.size() <= 0 ) {
						indexByPopSubDep1Idx.remove( keyPopSubDep1Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamPopSubDep2ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyUNameIdx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamPopSubDep2Obj)schema.getPopDepTableObj().realisePopDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				CFBamPopDepByRelationIdxKey keyRelationIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopSubDep1Idx != null ) {
				CFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
				keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyPopSubDep1Idx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapPopSubDep1Idx = indexByPopSubDep1Idx.get( keyPopSubDep1Idx );
				if( mapPopSubDep1Idx != null ) {
					mapPopSubDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamPopSubDep2ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyUNameIdx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allPopSubDep2 != null ) {
				allPopSubDep2.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFBamPopSubDep2Obj)schema.getPopDepTableObj().realisePopDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allPopSubDep2 != null ) {
				allPopSubDep2.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				CFBamPopDepByRelationIdxKey keyRelationIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopSubDep1Idx != null ) {
				CFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
				keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyPopSubDep1Idx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				Map<CFBamScopePKey, ICFBamPopSubDep2Obj > mapPopSubDep1Idx = indexByPopSubDep1Idx.get( keyPopSubDep1Idx );
				if( mapPopSubDep1Idx != null ) {
					mapPopSubDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamPopSubDep2ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyUNameIdx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFBamPopSubDep2Obj createPopSubDep2( ICFBamPopSubDep2Obj Obj ) {
		ICFBamPopSubDep2Obj obj = Obj;
		CFBamPopSubDep2Buff buff = obj.getPopSubDep2Buff();
		((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().createPopSubDep2(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a832" ) ) {
			obj = (ICFBamPopSubDep2Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamPopSubDep2Obj readPopSubDep2( CFBamScopePKey pkey ) {
		return( readPopSubDep2( pkey, false ) );
	}

	public ICFBamPopSubDep2Obj readPopSubDep2( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamPopSubDep2Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamPopSubDep2Buff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamPopSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamPopSubDep2Obj readCachedPopSubDep2( CFBamScopePKey pkey ) {
		ICFBamPopSubDep2Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposePopSubDep2( ICFBamPopSubDep2Obj obj )
	{
		final String S_ProcName = "CFBamPopSubDep2TableObj.reallyDeepDisposePopSubDep2() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamPopSubDep2Obj existing = readCachedPopSubDep2( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
		keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( existing.getRequiredPopSubDep1TenantId() );
		keyPopSubDep1Idx.setRequiredPopSubDep1Id( existing.getRequiredPopSubDep1Id() );

		CFBamPopSubDep2ByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredPopSubDep1TenantId( existing.getRequiredPopSubDep1TenantId() );
		keyUNameIdx.setRequiredPopSubDep1Id( existing.getRequiredPopSubDep1Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


		schema.getPopSubDep3TableObj().deepDisposePopSubDep3ByPopSubDep2Idx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByPopSubDep1Idx != null ) {
			if( indexByPopSubDep1Idx.containsKey( keyPopSubDep1Idx ) ) {
				indexByPopSubDep1Idx.get( keyPopSubDep1Idx ).remove( pkey );
				if( indexByPopSubDep1Idx.get( keyPopSubDep1Idx ).size() <= 0 ) {
					indexByPopSubDep1Idx.remove( keyPopSubDep1Idx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getPopDepTableObj().reallyDeepDisposePopDep( obj );
	}
	public void deepDisposePopSubDep2( CFBamScopePKey pkey ) {
		ICFBamPopSubDep2Obj obj = readCachedPopSubDep2( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamPopSubDep2Obj lockPopSubDep2( CFBamScopePKey pkey ) {
		ICFBamPopSubDep2Obj locked = null;
		CFBamPopSubDep2Buff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamPopSubDep2Obj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockPopSubDep2", pkey );
		}
		return( locked );
	}

	public List<ICFBamPopSubDep2Obj> readAllPopSubDep2() {
		return( readAllPopSubDep2( false ) );
	}

	public List<ICFBamPopSubDep2Obj> readAllPopSubDep2( boolean forceRead ) {
		final String S_ProcName = "readAllPopSubDep2";
		if( ( allPopSubDep2 == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamPopSubDep2Obj> map = new HashMap<CFBamScopePKey,ICFBamPopSubDep2Obj>();
			allPopSubDep2 = map;
			CFBamPopSubDep2Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().readAllDerived( schema.getAuthorization() );
			CFBamPopSubDep2Buff buff;
			ICFBamPopSubDep2Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep2Obj realised = (ICFBamPopSubDep2Obj)obj.realise();
			}
		}
		int len = allPopSubDep2.size();
		ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
		Iterator<ICFBamPopSubDep2Obj> valIter = allPopSubDep2.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamPopSubDep2Obj> readCachedAllPopSubDep2() {
		final String S_ProcName = "readCachedAllPopSubDep2";
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>();
		if( allPopSubDep2 != null ) {
			int len = allPopSubDep2.size();
			ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
			Iterator<ICFBamPopSubDep2Obj> valIter = allPopSubDep2.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamPopSubDep2Obj readPopSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		return( readPopSubDep2ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamPopSubDep2Obj readPopSubDep2ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamPopSubDep2Obj obj = readPopSubDep2( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamPopSubDep2Obj> readPopSubDep2ByTenantIdx( long TenantId )
	{
		return( readPopSubDep2ByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamPopSubDep2Obj> readPopSubDep2ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep2ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamPopSubDep2Obj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep2Obj realised = (ICFBamPopSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
		Iterator<ICFBamPopSubDep2Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamPopSubDep2Obj> readPopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		return( readPopSubDep2ByRelationIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<ICFBamPopSubDep2Obj> readPopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep2ByRelationIdx";
		CFBamPopDepByRelationIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict;
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< CFBamPopDepByRelationIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByRelationIdx.containsKey( key ) ) {
			dict = indexByRelationIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamPopSubDep2Obj>();
			ICFBamPopDepObj obj;
			CFBamPopDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			CFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep2Obj realised = (ICFBamPopSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelationIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
		Iterator<ICFBamPopSubDep2Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamPopSubDep2Obj> readPopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readPopSubDep2ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamPopSubDep2Obj> readPopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep2ByDefSchemaIdx";
		CFBamPopDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamPopDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamPopSubDep2Obj>();
			ICFBamPopDepObj obj;
			CFBamPopDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep2Obj realised = (ICFBamPopSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
		Iterator<ICFBamPopSubDep2Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamPopSubDep2Obj> readPopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		return( readPopSubDep2ByPopSubDep1Idx( PopSubDep1TenantId,
			PopSubDep1Id,
			false ) );
	}

	public List<ICFBamPopSubDep2Obj> readPopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep2ByPopSubDep1Idx";
		CFBamPopSubDep2ByPopSubDep1IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict;
		if( indexByPopSubDep1Idx == null ) {
			indexByPopSubDep1Idx = new HashMap< CFBamPopSubDep2ByPopSubDep1IdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByPopSubDep1Idx.containsKey( key ) ) {
			dict = indexByPopSubDep1Idx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamPopSubDep2Obj>();
			ICFBamPopSubDep2Obj obj;
			CFBamPopSubDep2Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().readDerivedByPopSubDep1Idx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id );
			CFBamPopSubDep2Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep2Obj realised = (ICFBamPopSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPopSubDep1Idx.put( key, dict );
		}
		int len = dict.size();
		ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
		Iterator<ICFBamPopSubDep2Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamPopSubDep2Obj readPopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		return( readPopSubDep2ByUNameIdx( PopSubDep1TenantId,
			PopSubDep1Id,
			Name,
			false ) );
	}

	public ICFBamPopSubDep2Obj readPopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamPopSubDep2ByUNameIdxKey,
				ICFBamPopSubDep2Obj >();
		}
		CFBamPopSubDep2ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		key.setRequiredName( Name );
		ICFBamPopSubDep2Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamPopSubDep2Buff buff = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().readDerivedByUNameIdx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
			if( buff != null ) {
				obj = (ICFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamPopSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamPopSubDep2Obj readCachedPopSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		ICFBamPopSubDep2Obj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedPopSubDep2( pkey );
		return( obj );
	}

	public List<ICFBamPopSubDep2Obj> readCachedPopSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedPopSubDep2ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
				Iterator<ICFBamPopSubDep2Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamPopSubDep2Obj obj;
			Iterator<ICFBamPopSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamPopSubDep2Obj> readCachedPopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedPopSubDep2ByRelationIdx";
		CFBamPopDepByRelationIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>();
		if( indexByRelationIdx != null ) {
			Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict;
			if( indexByRelationIdx.containsKey( key ) ) {
				dict = indexByRelationIdx.get( key );
				int len = dict.size();
				ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
				Iterator<ICFBamPopSubDep2Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamPopSubDep2Obj obj;
			Iterator<ICFBamPopSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamPopSubDep2Obj> readCachedPopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedPopSubDep2ByDefSchemaIdx";
		CFBamPopDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
				Iterator<ICFBamPopSubDep2Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamPopSubDep2Obj obj;
			Iterator<ICFBamPopSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamPopSubDep2Obj> readCachedPopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		final String S_ProcName = "readCachedPopSubDep2ByPopSubDep1Idx";
		CFBamPopSubDep2ByPopSubDep1IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		ArrayList<ICFBamPopSubDep2Obj> arrayList = new ArrayList<ICFBamPopSubDep2Obj>();
		if( indexByPopSubDep1Idx != null ) {
			Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict;
			if( indexByPopSubDep1Idx.containsKey( key ) ) {
				dict = indexByPopSubDep1Idx.get( key );
				int len = dict.size();
				ICFBamPopSubDep2Obj arr[] = new ICFBamPopSubDep2Obj[len];
				Iterator<ICFBamPopSubDep2Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamPopSubDep2Obj obj;
			Iterator<ICFBamPopSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamPopSubDep2Obj> cmp = new Comparator<ICFBamPopSubDep2Obj>() {
			public int compare( ICFBamPopSubDep2Obj lhs, ICFBamPopSubDep2Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamPopSubDep2Obj readCachedPopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		ICFBamPopSubDep2Obj obj = null;
		CFBamPopSubDep2ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamPopSubDep2Obj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<ICFBamPopSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public void deepDisposePopSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		ICFBamPopSubDep2Obj obj = readCachedPopSubDep2ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposePopSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposePopSubDep2ByTenantIdx";
		ICFBamPopSubDep2Obj obj;
		List<ICFBamPopSubDep2Obj> arrayList = readCachedPopSubDep2ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamPopSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposePopSubDep2ByRelationIdx";
		ICFBamPopSubDep2Obj obj;
		List<ICFBamPopSubDep2Obj> arrayList = readCachedPopSubDep2ByRelationIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<ICFBamPopSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposePopSubDep2ByDefSchemaIdx";
		ICFBamPopSubDep2Obj obj;
		List<ICFBamPopSubDep2Obj> arrayList = readCachedPopSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamPopSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		final String S_ProcName = "deepDisposePopSubDep2ByPopSubDep1Idx";
		ICFBamPopSubDep2Obj obj;
		List<ICFBamPopSubDep2Obj> arrayList = readCachedPopSubDep2ByPopSubDep1Idx( PopSubDep1TenantId,
				PopSubDep1Id );
		if( arrayList != null )  {
			Iterator<ICFBamPopSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		ICFBamPopSubDep2Obj obj = readCachedPopSubDep2ByUNameIdx( PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamPopSubDep2Obj updatePopSubDep2( ICFBamPopSubDep2Obj Obj ) {
		ICFBamPopSubDep2Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().updatePopSubDep2( schema.getAuthorization(),
			Obj.getPopSubDep2Buff() );
		if( Obj.getClassCode().equals( "a832" ) ) {
			obj = (ICFBamPopSubDep2Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deletePopSubDep2( ICFBamPopSubDep2Obj Obj ) {
		ICFBamPopSubDep2Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2( schema.getAuthorization(),
			obj.getPopSubDep2Buff() );
		Obj.forget();
	}

	public void deletePopSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamPopSubDep2Obj obj = readPopSubDep2( pkey );
		if( obj != null ) {
			ICFBamPopSubDep2EditObj editObj = (ICFBamPopSubDep2EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamPopSubDep2EditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposePopSubDep2ByIdIdx( TenantId,
				Id );
	}

	public void deletePopSubDep2ByTenantIdx( long TenantId )
	{
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep2Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamPopSubDep2Obj> iter = dict.values().iterator();
			ICFBamPopSubDep2Obj obj;
			List<ICFBamPopSubDep2Obj> toForget = new LinkedList<ICFBamPopSubDep2Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposePopSubDep2ByTenantIdx( TenantId );
	}

	public void deletePopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		CFBamPopDepByRelationIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< CFBamPopDepByRelationIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep2Obj > >();
		}
		if( indexByRelationIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict = indexByRelationIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<ICFBamPopSubDep2Obj> iter = dict.values().iterator();
			ICFBamPopSubDep2Obj obj;
			List<ICFBamPopSubDep2Obj> toForget = new LinkedList<ICFBamPopSubDep2Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRelationIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposePopSubDep2ByRelationIdx( RelationTenantId,
				RelationId );
	}

	public void deletePopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamPopDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamPopDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep2Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamPopSubDep2Obj> iter = dict.values().iterator();
			ICFBamPopSubDep2Obj obj;
			List<ICFBamPopSubDep2Obj> toForget = new LinkedList<ICFBamPopSubDep2Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefSchemaIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposePopSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deletePopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		CFBamPopSubDep2ByPopSubDep1IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		if( indexByPopSubDep1Idx == null ) {
			indexByPopSubDep1Idx = new HashMap< CFBamPopSubDep2ByPopSubDep1IdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep2Obj > >();
		}
		if( indexByPopSubDep1Idx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamPopSubDep2Obj> dict = indexByPopSubDep1Idx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByPopSubDep1Idx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id );
			Iterator<ICFBamPopSubDep2Obj> iter = dict.values().iterator();
			ICFBamPopSubDep2Obj obj;
			List<ICFBamPopSubDep2Obj> toForget = new LinkedList<ICFBamPopSubDep2Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPopSubDep1Idx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByPopSubDep1Idx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id );
		}
		deepDisposePopSubDep2ByPopSubDep1Idx( PopSubDep1TenantId,
				PopSubDep1Id );
	}

	public void deletePopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamPopSubDep2ByUNameIdxKey,
				ICFBamPopSubDep2Obj >();
		}
		CFBamPopSubDep2ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		key.setRequiredName( Name );
		ICFBamPopSubDep2Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByUNameIdx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByUNameIdx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
		}
		deepDisposePopSubDep2ByUNameIdx( PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
	}
}