'when {
        this == packageName -> true
        packageName.isRoot -> true
        else -> isSubpackageOf(this.asString(), packageName.asString())
    }' @ [20:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [21:9] ==> <this> defined in org.jetbrains.kotlin.name.isSubpackageOf[ReceiverParameterDescriptorImpl]

'packageName' @ [21:17] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.name.isSubpackageOf[ValueParameterDescriptorImpl]

'packageName' @ [22:9] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.name.isSubpackageOf[ValueParameterDescriptorImpl]

'isRoot' @ [22:21] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'isSubpackageOf' @ [23:17] ==> private fun isSubpackageOf(subpackageNameStr: String, packageNameStr: String): Boolean defined in org.jetbrains.kotlin.name in file FqNamesUtil.kt[SimpleFunctionDescriptorImpl]

'this' @ [23:32] ==> <this> defined in org.jetbrains.kotlin.name.isSubpackageOf[ReceiverParameterDescriptorImpl]

'asString' @ [23:37] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'packageName' @ [23:49] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.name.isSubpackageOf[ValueParameterDescriptorImpl]

'asString' @ [23:61] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'parentOrNull' @ [27:54] ==> public fun FqName.parentOrNull(): FqName? defined in org.jetbrains.kotlin.name in file FqNamesUtil.kt[SimpleFunctionDescriptorImpl]

'packageName' @ [27:72] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.name.isChildOf[ValueParameterDescriptorImpl]

'subpackageNameStr' @ [30:12] ==> value-parameter subpackageNameStr: String defined in org.jetbrains.kotlin.name.isSubpackageOf[ValueParameterDescriptorImpl]

'startsWith' @ [30:30] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'packageNameStr' @ [30:41] ==> value-parameter packageNameStr: String defined in org.jetbrains.kotlin.name.isSubpackageOf[ValueParameterDescriptorImpl]

'subpackageNameStr' @ [30:60] ==> value-parameter subpackageNameStr: String defined in org.jetbrains.kotlin.name.isSubpackageOf[ValueParameterDescriptorImpl]

'packageNameStr' @ [30:78] ==> value-parameter packageNameStr: String defined in org.jetbrains.kotlin.name.isSubpackageOf[ValueParameterDescriptorImpl]

'length' @ [30:93] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'!' @ [33:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isRoot' @ [33:42] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'parent' @ [33:52] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'isRoot' @ [33:61] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'when {
        !isSubpackageOf(prefix) || prefix.isRoot -> this
        this == prefix -> FqName.ROOT
        else -> FqName(asString().substring(prefix.asString().length + 1))
    }' @ [45:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FqName, entry1: FqName, entry2: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FqName

'!' @ [46:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSubpackageOf' @ [46:10] ==> public fun FqName.isSubpackageOf(packageName: FqName): Boolean defined in org.jetbrains.kotlin.name in file FqNamesUtil.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [46:25] ==> value-parameter prefix: FqName defined in org.jetbrains.kotlin.name.tail[ValueParameterDescriptorImpl]

'prefix' @ [46:36] ==> value-parameter prefix: FqName defined in org.jetbrains.kotlin.name.tail[ValueParameterDescriptorImpl]

'isRoot' @ [46:43] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'this' @ [46:53] ==> <this> defined in org.jetbrains.kotlin.name.tail[ReceiverParameterDescriptorImpl]

'this' @ [47:9] ==> <this> defined in org.jetbrains.kotlin.name.tail[ReceiverParameterDescriptorImpl]

'prefix' @ [47:17] ==> value-parameter prefix: FqName defined in org.jetbrains.kotlin.name.tail[ValueParameterDescriptorImpl]

'ROOT' @ [47:34] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'FqName' @ [48:17] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'asString' @ [48:24] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'substring' @ [48:35] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [48:45] ==> value-parameter prefix: FqName defined in org.jetbrains.kotlin.name.tail[ValueParameterDescriptorImpl]

'asString' @ [48:52] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'length' @ [48:63] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'if (this.isRoot) null else parent()' @ [52:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName?, elseBranch: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName?

'this' @ [52:42] ==> <this> defined in org.jetbrains.kotlin.name.parentOrNull[ReceiverParameterDescriptorImpl]

'isRoot' @ [52:47] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'parent' @ [52:65] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'qualifiedName' @ [62:9] ==> value-parameter qualifiedName: String? defined in org.jetbrains.kotlin.name.isValidJavaFqName[ValueParameterDescriptorImpl]

'BEGINNING' @ [64:23] ==> enum entry BEGINNING defined in org.jetbrains.kotlin.name.State[FakeCallableDescriptorForObject]

'qualifiedName' @ [66:15] ==> value-parameter qualifiedName: String? defined in org.jetbrains.kotlin.name.isValidJavaFqName[ValueParameterDescriptorImpl]

'when (state) {
            State.BEGINNING, State.AFTER_DOT -> {
                if (!Character.isJavaIdentifierPart(c)) return false
                state = State.MIDDLE
            }
            State.MIDDLE -> {
                if (c == '.') {
                    state = State.AFTER_DOT
                }
                else if (!Character.isJavaIdentifierPart(c)) return false
            }
        }' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'state' @ [67:15] ==> var state: State defined in org.jetbrains.kotlin.name.isValidJavaFqName[LocalVariableDescriptor]

'BEGINNING' @ [68:19] ==> enum entry BEGINNING defined in org.jetbrains.kotlin.name.State[FakeCallableDescriptorForObject]

'AFTER_DOT' @ [68:36] ==> enum entry AFTER_DOT defined in org.jetbrains.kotlin.name.State[FakeCallableDescriptorForObject]

'!' @ [69:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isJavaIdentifierPart' @ [69:32] ==> public open fun isJavaIdentifierPart(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'c' @ [69:53] ==> val c: Char defined in org.jetbrains.kotlin.name.isValidJavaFqName[LocalVariableDescriptor]

'state' @ [70:17] ==> var state: State defined in org.jetbrains.kotlin.name.isValidJavaFqName[LocalVariableDescriptor]

'MIDDLE' @ [70:31] ==> enum entry MIDDLE defined in org.jetbrains.kotlin.name.State[FakeCallableDescriptorForObject]

'MIDDLE' @ [72:19] ==> enum entry MIDDLE defined in org.jetbrains.kotlin.name.State[FakeCallableDescriptorForObject]

'if (c == '.') {
                    state = State.AFTER_DOT
                }
                else if (!Character.isJavaIdentifierPart(c)) return false' @ [73:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'c' @ [73:21] ==> val c: Char defined in org.jetbrains.kotlin.name.isValidJavaFqName[LocalVariableDescriptor]

'state' @ [74:21] ==> var state: State defined in org.jetbrains.kotlin.name.isValidJavaFqName[LocalVariableDescriptor]

'AFTER_DOT' @ [74:35] ==> enum entry AFTER_DOT defined in org.jetbrains.kotlin.name.State[FakeCallableDescriptorForObject]

'!' @ [76:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isJavaIdentifierPart' @ [76:37] ==> public open fun isJavaIdentifierPart(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'c' @ [76:58] ==> val c: Char defined in org.jetbrains.kotlin.name.isValidJavaFqName[LocalVariableDescriptor]

'state' @ [81:12] ==> var state: State defined in org.jetbrains.kotlin.name.isValidJavaFqName[LocalVariableDescriptor]

'AFTER_DOT' @ [81:27] ==> enum entry AFTER_DOT defined in org.jetbrains.kotlin.name.State[FakeCallableDescriptorForObject]

