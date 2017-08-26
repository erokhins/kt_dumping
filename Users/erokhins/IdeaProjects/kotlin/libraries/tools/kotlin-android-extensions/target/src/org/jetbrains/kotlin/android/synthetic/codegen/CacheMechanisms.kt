'getObjectType' @ [42:25] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'when (cacheImpl) {
                CacheImplementation.SPARSE_ARRAY -> "android.util.SparseArray"
                CacheImplementation.HASH_MAP -> HashMap::class.java.canonicalName
                CacheImplementation.NO_CACHE -> throw IllegalArgumentException("Container should support cache")
            }' @ [42:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (String..String?), entry1: (String..String?), entry2: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'cacheImpl' @ [42:45] ==> value-parameter cacheImpl: CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism.Companion.getType[ValueParameterDescriptorImpl]

'CacheImplementation' @ [43:17] ==> public companion object defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'SPARSE_ARRAY' @ [43:37] ==> enum entry SPARSE_ARRAY defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'CacheImplementation' @ [44:17] ==> public companion object defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'HASH_MAP' @ [44:37] ==> enum entry HASH_MAP defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'HashMap' @ [44:49] ==> public final fun <K, V> <init>(): HashMap<???, ???> /* = HashMap<???, ???> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@50e8ebdf
    <V> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@1cfc0624

'java' @ [44:64] ==> public val <T> KClass<HashMap<*, *>>.java: Class<HashMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> HashMap<*, *>

'canonicalName' @ [44:69] ==> public final val <T : (Any..Any?)> Class<HashMap<*, *>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> HashMap<*, *>

'CacheImplementation' @ [45:17] ==> public companion object defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'NO_CACHE' @ [45:37] ==> enum entry NO_CACHE defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'IllegalArgumentException' @ [45:55] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'replace' @ [46:15] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (cacheImpl) {
                CacheImplementation.HASH_MAP -> HashMapCacheMechanism(iv, containerType)
                CacheImplementation.SPARSE_ARRAY -> SparseArrayCacheMechanism(iv, containerType)
                CacheImplementation.NO_CACHE -> throw IllegalArgumentException("Container should support cache")
            }' @ [50:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CacheMechanism, entry1: CacheMechanism, entry2: CacheMechanism): CacheMechanism[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CacheMechanism

'cacheImpl' @ [50:26] ==> value-parameter cacheImpl: CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism.Companion.get[ValueParameterDescriptorImpl]

'CacheImplementation' @ [51:17] ==> public companion object defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'HASH_MAP' @ [51:37] ==> enum entry HASH_MAP defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'HashMapCacheMechanism' @ [51:49] ==> public constructor HashMapCacheMechanism(iv: InstructionAdapter, containerType: Type) defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[ClassConstructorDescriptorImpl]

'iv' @ [51:71] ==> value-parameter iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism.Companion.get[ValueParameterDescriptorImpl]

'containerType' @ [51:75] ==> value-parameter containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism.Companion.get[ValueParameterDescriptorImpl]

'CacheImplementation' @ [52:17] ==> public companion object defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'SPARSE_ARRAY' @ [52:37] ==> enum entry SPARSE_ARRAY defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'SparseArrayCacheMechanism' @ [52:53] ==> public constructor SparseArrayCacheMechanism(iv: InstructionAdapter, containerType: Type) defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[ClassConstructorDescriptorImpl]

'iv' @ [52:79] ==> value-parameter iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism.Companion.get[ValueParameterDescriptorImpl]

'containerType' @ [52:83] ==> value-parameter containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism.Companion.get[ValueParameterDescriptorImpl]

'CacheImplementation' @ [53:17] ==> public companion object defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'NO_CACHE' @ [53:37] ==> enum entry NO_CACHE defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'IllegalArgumentException' @ [53:55] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'iv' @ [64:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'load' @ [64:12] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [64:20] ==> public final val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'iv' @ [65:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'getfield' @ [65:12] ==> public open fun getfield(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [65:21] ==> public final val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'internalName' @ [65:35] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'PROPERTY_NAME' @ [65:49] ==> public final val PROPERTY_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyImportedFromObject]

'iv' @ [69:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'load' @ [69:12] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [69:20] ==> public final val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'iv' @ [70:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'anew' @ [70:12] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'getType' @ [70:22] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'iv' @ [71:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'dup' @ [71:12] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [72:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'invokespecial' @ [72:12] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [73:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'putfield' @ [73:12] ==> public open fun putfield(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [73:21] ==> public final val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'internalName' @ [73:35] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'PROPERTY_NAME' @ [73:49] ==> public final val PROPERTY_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyImportedFromObject]

'iv' @ [77:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'invokevirtual' @ [77:12] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [81:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'invokestatic' @ [81:12] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [82:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'invokevirtual' @ [82:12] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [86:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'invokestatic' @ [86:12] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'invoke' @ [87:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'iv' @ [88:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'invokevirtual' @ [88:12] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [89:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.HashMapCacheMechanism[PropertyDescriptorImpl]

'pop' @ [89:12] ==> public open fun pop(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [98:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'load' @ [98:12] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [98:20] ==> public final val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'iv' @ [99:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'getfield' @ [99:12] ==> public open fun getfield(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [99:21] ==> public final val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'internalName' @ [99:35] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'PROPERTY_NAME' @ [99:49] ==> public final val PROPERTY_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyImportedFromObject]

'iv' @ [103:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'load' @ [103:12] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [103:20] ==> public final val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'iv' @ [104:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'anew' @ [104:12] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'getType' @ [104:22] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'iv' @ [105:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'dup' @ [105:12] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [106:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'invokespecial' @ [106:12] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [107:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'putfield' @ [107:12] ==> public open fun putfield(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [107:21] ==> public final val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'internalName' @ [107:35] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'PROPERTY_NAME' @ [107:49] ==> public final val PROPERTY_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyImportedFromObject]

'iv' @ [111:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'invokevirtual' @ [111:12] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [115:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'invokevirtual' @ [115:12] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'invoke' @ [119:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'iv' @ [120:9] ==> public final val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.SparseArrayCacheMechanism[PropertyDescriptorImpl]

'invokevirtual' @ [120:12] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

