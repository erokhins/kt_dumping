'JvmOverloads' @ [23:23] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'fqName' @ [26:17] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'toUnsafe' @ [26:24] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'render' @ [26:35] ==> public fun FqNameUnsafe.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'if (isAllUnder) ".*" else ""' @ [26:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isAllUnder' @ [26:50] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'pathStr' @ [29:16] ==> public final val pathStr: String defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'if (alias != null) " as " + alias.asString() else ""' @ [29:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'alias' @ [29:30] ==> public final val alias: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'+' @ [29:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'alias' @ [29:54] ==> public final val alias: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'asString' @ [29:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'alias' @ [33:16] ==> public final val alias: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'!' @ [38:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAllUnder' @ [38:18] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'alias' @ [39:24] ==> public final val alias: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'fqName' @ [39:33] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'shortName' @ [39:40] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'JvmStatic' @ [46:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (pathStr.endsWith(".*")) {
                ImportPath(FqName(pathStr.substring(0, pathStr.length - 2)), isAllUnder = true)
            }
            else {
                ImportPath(FqName(pathStr), isAllUnder = false)

            }' @ [47:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ImportPath, elseBranch: ImportPath): ImportPath[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ImportPath

'pathStr' @ [47:24] ==> value-parameter pathStr: String defined in org.jetbrains.kotlin.resolve.ImportPath.Companion.fromString[ValueParameterDescriptorImpl]

'endsWith' @ [47:32] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ImportPath' @ [48:17] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[ClassConstructorDescriptorImpl]

'FqName' @ [48:28] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'pathStr' @ [48:35] ==> value-parameter pathStr: String defined in org.jetbrains.kotlin.resolve.ImportPath.Companion.fromString[ValueParameterDescriptorImpl]

'substring' @ [48:43] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathStr' @ [48:56] ==> value-parameter pathStr: String defined in org.jetbrains.kotlin.resolve.ImportPath.Companion.fromString[ValueParameterDescriptorImpl]

'length' @ [48:64] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ImportPath' @ [51:17] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[ClassConstructorDescriptorImpl]

'FqName' @ [51:28] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'pathStr' @ [51:35] ==> value-parameter pathStr: String defined in org.jetbrains.kotlin.resolve.ImportPath.Companion.fromString[ValueParameterDescriptorImpl]

