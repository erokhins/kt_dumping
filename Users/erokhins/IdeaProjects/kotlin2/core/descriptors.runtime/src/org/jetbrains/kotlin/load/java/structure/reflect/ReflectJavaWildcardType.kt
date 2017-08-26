'ReflectJavaType' @ [22:72] ==> public constructor ReflectJavaType() defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[ClassConstructorDescriptorImpl]

'reflectType' @ [25:31] ==> protected open val reflectType: WildcardType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType[PropertyDescriptorImpl]

'upperBounds' @ [25:43] ==> public final val WildcardType.upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'reflectType' @ [26:31] ==> protected open val reflectType: WildcardType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType[PropertyDescriptorImpl]

'lowerBounds' @ [26:43] ==> public final val WildcardType.lowerBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'upperBounds' @ [27:17] ==> val upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType.<get-bound>[LocalVariableDescriptor]

'size' @ [27:29] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'lowerBounds' @ [27:41] ==> val lowerBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType.<get-bound>[LocalVariableDescriptor]

'size' @ [27:53] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'UnsupportedOperationException' @ [28:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'reflectType' @ [28:110] ==> protected open val reflectType: WildcardType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType[PropertyDescriptorImpl]

'when {
                lowerBounds.size == 1 -> ReflectJavaType.create(lowerBounds.single())
                upperBounds.size == 1 -> upperBounds.single().let { ub -> if (ub != Any::class.java) ReflectJavaType.create(ub) else null }
                else -> null
            }' @ [30:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReflectJavaType?, entry1: ReflectJavaType?, entry2: ReflectJavaType?): ReflectJavaType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReflectJavaType?

'lowerBounds' @ [31:17] ==> val lowerBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType.<get-bound>[LocalVariableDescriptor]

'size' @ [31:29] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'ReflectJavaType' @ [31:42] ==> public companion object Factory defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[FakeCallableDescriptorForObject]

'create' @ [31:58] ==> public final fun create(type: Type): ReflectJavaType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory[SimpleFunctionDescriptorImpl]

'lowerBounds' @ [31:65] ==> val lowerBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType.<get-bound>[LocalVariableDescriptor]

'single' @ [31:77] ==> public fun <T> Array<out (Type..Type?)>.single(): (Type..Type?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'upperBounds' @ [32:17] ==> val upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType.<get-bound>[LocalVariableDescriptor]

'size' @ [32:29] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'upperBounds' @ [32:42] ==> val upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType.<get-bound>[LocalVariableDescriptor]

'single' @ [32:54] ==> public fun <T> Array<out (Type..Type?)>.single(): (Type..Type?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'let' @ [32:63] ==> @InlineOnly public inline fun <T, R> (Type..Type?).let(block: ((Type..Type?)) -> ReflectJavaType?): ReflectJavaType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)
    <R> -> ReflectJavaType?

'if (ub != Any::class.java) ReflectJavaType.create(ub) else null' @ [32:75] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReflectJavaType?, elseBranch: ReflectJavaType?): ReflectJavaType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReflectJavaType?

'ub' @ [32:79] ==> value-parameter ub: (Type..Type?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType.<get-bound>.<anonymous>[ValueParameterDescriptorImpl]

'Any' @ [32:85] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [32:96] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'ReflectJavaType' @ [32:102] ==> public companion object Factory defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[FakeCallableDescriptorForObject]

'create' @ [32:118] ==> public final fun create(type: Type): ReflectJavaType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory[SimpleFunctionDescriptorImpl]

'ub' @ [32:125] ==> value-parameter ub: (Type..Type?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType.<get-bound>.<anonymous>[ValueParameterDescriptorImpl]

'reflectType' @ [38:17] ==> protected open val reflectType: WildcardType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType[PropertyDescriptorImpl]

'upperBounds' @ [38:29] ==> public final val WildcardType.upperBounds: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'firstOrNull' @ [38:41] ==> public fun <T> Array<out (Type..Type?)>.firstOrNull(): Type? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'Any' @ [38:58] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [38:69] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

