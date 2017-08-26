'isDescriptorWithLocalVisibility' @ [35:25] ==> public open fun isDescriptorWithLocalVisibility(p0: (DeclarationDescriptor..DeclarationDescriptor?)): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [35:57] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'descriptor' @ [36:9] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'descriptor' @ [36:62] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'visibility' @ [36:73] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [36:100] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'!' @ [37:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNativeObject' @ [37:27] ==> public open fun isNativeObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [37:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'!' @ [37:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLibraryObject' @ [37:75] ==> public open fun isLibraryObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [37:91] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'when (descriptor) {
        is CallableDescriptor -> {
            val parent = generateSignature(descriptor.containingDeclaration) ?: return null
            if (descriptor !is VariableAccessorDescriptor && descriptor !is ConstructorDescriptor && descriptor.name.isSpecial) {
                return null
            }

            // Make distinction between functions with zero parameters and properties
            val separator = if (descriptor is FunctionDescriptor) "#" else "!"

            parent + separator + escape(descriptor.name.asString()) + "|" + encodeSignature(descriptor)
        }
        is PackageFragmentDescriptor -> {
            val module = descriptor.module.name.asString()
            val parts = sequenceOf(module) + descriptor.fqName.pathSegments().map { it.identifier }
            parts.joinToString(".") { escape(it) }
        }
        is ClassDescriptor -> {
            val parent = generateSignature(descriptor.containingDeclaration) ?: return null
            if (descriptor.name.isSpecial) return null
            parent + "$" + escape(descriptor.name.asString())
        }
        else -> return null
    }' @ [41:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'descriptor' @ [41:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'generateSignature' @ [43:26] ==> public fun generateSignature(descriptor: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.js.translate.utils in file signatureUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [43:44] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'containingDeclaration' @ [43:55] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [44:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'descriptor' @ [44:62] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'descriptor' @ [44:102] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'name' @ [44:113] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [44:118] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'if (descriptor is FunctionDescriptor) "#" else "!"' @ [49:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptor' @ [49:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'parent' @ [51:13] ==> val parent: String defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[LocalVariableDescriptor]

'separator' @ [51:22] ==> val separator: String defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[LocalVariableDescriptor]

'escape' @ [51:34] ==> private fun escape(s: String): String defined in org.jetbrains.kotlin.js.translate.utils in file signatureUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [51:41] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'name' @ [51:52] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [51:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'encodeSignature' @ [51:77] ==> public fun encodeSignature(descriptor: CallableDescriptor): String defined in org.jetbrains.kotlin.js.naming[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [51:93] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'descriptor' @ [54:26] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'module' @ [54:37] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'name' @ [54:44] ==> public final val ModuleDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [54:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'sequenceOf' @ [55:25] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'module' @ [55:36] ==> val module: String defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[LocalVariableDescriptor]

'descriptor' @ [55:46] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'fqName' @ [55:57] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'pathSegments' @ [55:64] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'map' @ [55:79] ==> public inline fun <T, R> Iterable<(Name..Name?)>.map(transform: ((Name..Name?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)
    <R> -> String

'it' @ [55:85] ==> value-parameter it: (Name..Name?) defined in org.jetbrains.kotlin.js.translate.utils.generateSignature.<anonymous>[ValueParameterDescriptorImpl]

'identifier' @ [55:88] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'parts' @ [56:13] ==> val parts: Sequence<String> defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[LocalVariableDescriptor]

'joinToString' @ [56:19] ==> public fun <T> Sequence<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'escape' @ [56:39] ==> private fun escape(s: String): String defined in org.jetbrains.kotlin.js.translate.utils in file signatureUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [56:46] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.translate.utils.generateSignature.<anonymous>[ValueParameterDescriptorImpl]

'generateSignature' @ [59:26] ==> public fun generateSignature(descriptor: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.js.translate.utils in file signatureUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [59:44] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'containingDeclaration' @ [59:55] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [60:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'name' @ [60:28] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [60:33] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'parent' @ [61:13] ==> val parent: String defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[LocalVariableDescriptor]

'escape' @ [61:28] ==> private fun escape(s: String): String defined in org.jetbrains.kotlin.js.translate.utils in file signatureUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [61:35] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateSignature[ValueParameterDescriptorImpl]

'name' @ [61:46] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [61:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'StringBuilder' @ [68:14] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

's' @ [69:15] ==> value-parameter s: String defined in org.jetbrains.kotlin.js.translate.utils.escape[ValueParameterDescriptorImpl]

'when (c) {
            '\\', '"', '.', '$', '#', '!', '<', '>', '|', '+', '-', ':', '*', '?' -> "\\$c"
            else -> c.toString()
        }' @ [70:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'c' @ [70:33] ==> val c: Char defined in org.jetbrains.kotlin.js.translate.utils.escape[LocalVariableDescriptor]

'c' @ [71:90] ==> val c: Char defined in org.jetbrains.kotlin.js.translate.utils.escape[LocalVariableDescriptor]

'c' @ [72:21] ==> val c: Char defined in org.jetbrains.kotlin.js.translate.utils.escape[LocalVariableDescriptor]

'toString' @ [72:23] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'sb' @ [74:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.translate.utils.escape[LocalVariableDescriptor]

'append' @ [74:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'escapedChar' @ [74:19] ==> val escapedChar: String defined in org.jetbrains.kotlin.js.translate.utils.escape[LocalVariableDescriptor]

'sb' @ [76:12] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.translate.utils.escape[LocalVariableDescriptor]

'toString' @ [76:15] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

