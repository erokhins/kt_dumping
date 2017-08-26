'name' @ [26:16] ==> public final val PsiNameIdentifierOwner.name: String?[MyPropertyDescriptor]

'if (name != null) Identifier(name, false).assignPrototype(nameIdentifier) else Identifier.Empty' @ [27:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Identifier, elseBranch: Identifier): Identifier[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Identifier

'name' @ [27:16] ==> val name: String? defined in org.jetbrains.kotlin.j2k.ast.declarationIdentifier[LocalVariableDescriptor]

'Identifier' @ [27:30] ==> public constructor Identifier(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...) defined in org.jetbrains.kotlin.j2k.ast.Identifier[ClassConstructorDescriptorImpl]

'name' @ [27:41] ==> val name: String? defined in org.jetbrains.kotlin.j2k.ast.declarationIdentifier[LocalVariableDescriptor]

'assignPrototype' @ [27:54] ==> public fun <TElement : Element> Identifier.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Identifier

'nameIdentifier' @ [27:70] ==> public final val PsiNameIdentifierOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'Identifier' @ [27:91] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'Empty' @ [27:102] ==> public final val Empty: Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'emptyList' @ [34:51] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'Expression' @ [35:5] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'name' @ [38:17] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'isEmpty' @ [38:22] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'quotingNeeded' @ [41:13] ==> private final val quotingNeeded: Boolean defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'KEYWORDS' @ [41:30] ==> private final val KEYWORDS: Set<String> defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'contains' @ [41:39] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'name' @ [41:48] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'name' @ [41:57] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'contains' @ [41:62] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'quote' @ [42:20] ==> private final fun quote(str: String): String defined in org.jetbrains.kotlin.j2k.ast.Identifier[SimpleFunctionDescriptorImpl]

'name' @ [42:26] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'name' @ [45:16] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'builder' @ [49:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Identifier.generateCode[ValueParameterDescriptorImpl]

'append' @ [49:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'toKotlin' @ [49:24] ==> private final fun toKotlin(): String defined in org.jetbrains.kotlin.j2k.ast.Identifier[SimpleFunctionDescriptorImpl]

'imports' @ [51:9] ==> private final val imports: Collection<FqName> defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'forEach' @ [51:17] ==> @HidesMembers public inline fun <T> Iterable<FqName>.forEach(action: (FqName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'builder' @ [51:27] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Identifier.generateCode[ValueParameterDescriptorImpl]

'addImport' @ [51:35] ==> public final fun addImport(fqName: FqName): Unit defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'it' @ [51:45] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.j2k.ast.Identifier.generateCode.<anonymous>[ValueParameterDescriptorImpl]

'str' @ [54:49] ==> value-parameter str: String defined in org.jetbrains.kotlin.j2k.ast.Identifier.quote[ValueParameterDescriptorImpl]

'if (isNullable) "$name?" else name' @ [56:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isNullable' @ [56:35] ==> public open val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'name' @ [56:49] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'name' @ [56:61] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'Identifier' @ [59:21] ==> public constructor Identifier(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...) defined in org.jetbrains.kotlin.j2k.ast.Identifier[ClassConstructorDescriptorImpl]

'KEYWORDS' @ [61:41] ==> public final val KEYWORDS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'types' @ [61:50] ==> public final val TokenSet.types: (Array<(IElementType..IElementType?)>..Array<out (IElementType..IElementType?)>)[MyPropertyDescriptor]

'map' @ [61:56] ==> public inline fun <T, R> Array<out (IElementType..IElementType?)>.map(transform: ((IElementType..IElementType?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)
    <R> -> String

'it' @ [61:63] ==> value-parameter it: (IElementType..IElementType?) defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion.KEYWORDS.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [61:85] ==> public final val KtKeywordToken.value: String[MyPropertyDescriptor]

'toSet' @ [61:93] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Identifier' @ [63:46] ==> public constructor Identifier(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...) defined in org.jetbrains.kotlin.j2k.ast.Identifier[ClassConstructorDescriptorImpl]

'name' @ [63:57] ==> value-parameter name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion.toKotlin[ValueParameterDescriptorImpl]

'toKotlin' @ [63:63] ==> private final fun toKotlin(): String defined in org.jetbrains.kotlin.j2k.ast.Identifier[SimpleFunctionDescriptorImpl]

'emptyList' @ [65:132] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'Identifier' @ [66:20] ==> public constructor Identifier(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...) defined in org.jetbrains.kotlin.j2k.ast.Identifier[ClassConstructorDescriptorImpl]

'name' @ [66:31] ==> value-parameter name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion.withNoPrototype[ValueParameterDescriptorImpl]

'isNullable' @ [66:37] ==> value-parameter isNullable: Boolean = ... defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion.withNoPrototype[ValueParameterDescriptorImpl]

'quotingNeeded' @ [66:49] ==> value-parameter quotingNeeded: Boolean = ... defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion.withNoPrototype[ValueParameterDescriptorImpl]

'imports' @ [66:64] ==> value-parameter imports: Collection<FqName> = ... defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion.withNoPrototype[ValueParameterDescriptorImpl]

'assignNoPrototype' @ [66:73] ==> public fun <TElement : Element> Identifier.assignNoPrototype(): Identifier defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Identifier

