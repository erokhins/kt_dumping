'Element' @ [26:75] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'extendsTypes' @ [27:31] ==> public final val extendsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[PropertyDescriptorImpl]

'size' @ [27:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'hasWhere' @ [30:13] ==> public final fun hasWhere(): Boolean defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[SimpleFunctionDescriptorImpl]

'builder' @ [31:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TypeParameter.whereToKotlin[ValueParameterDescriptorImpl]

'name' @ [31:28] ==> public final val name: Identifier defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[PropertyDescriptorImpl]

'extendsTypes' @ [31:53] ==> public final val extendsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[PropertyDescriptorImpl]

'builder' @ [36:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TypeParameter.generateCode[ValueParameterDescriptorImpl]

'name' @ [36:24] ==> public final val name: Identifier defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[PropertyDescriptorImpl]

'extendsTypes' @ [37:13] ==> public final val extendsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[PropertyDescriptorImpl]

'isNotEmpty' @ [37:26] ==> @InlineOnly public inline fun <T> Collection<Type>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'builder' @ [38:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TypeParameter.generateCode[ValueParameterDescriptorImpl]

'extendsTypes' @ [38:41] ==> public final val extendsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[PropertyDescriptorImpl]

'Element' @ [43:64] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'parameters' @ [45:13] ==> public final val parameters: List<TypeParameter> defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[PropertyDescriptorImpl]

'isNotEmpty' @ [45:24] ==> @InlineOnly public inline fun <T> Collection<TypeParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'builder' @ [45:38] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList.generateCode[ValueParameterDescriptorImpl]

'append' @ [45:46] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'parameters' @ [45:53] ==> public final val parameters: List<TypeParameter> defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[PropertyDescriptorImpl]

'hasWhere' @ [49:13] ==> private final fun hasWhere(): Boolean defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[SimpleFunctionDescriptorImpl]

'builder' @ [50:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList.appendWhere[ValueParameterDescriptorImpl]

'buildList' @ [50:21] ==> public fun <T> CodeBuilder.buildList(generators: Collection<() -> Unit>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'parameters' @ [50:44] ==> public final val parameters: List<TypeParameter> defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[PropertyDescriptorImpl]

'map' @ [50:55] ==> public inline fun <T, R> Iterable<TypeParameter>.map(transform: (TypeParameter) -> () -> Unit): List<() -> Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter
    <R> -> Function0<Unit>

'it' @ [50:63] ==> value-parameter it: TypeParameter defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList.appendWhere.<anonymous>[ValueParameterDescriptorImpl]

'whereToKotlin' @ [50:66] ==> public final fun whereToKotlin(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[SimpleFunctionDescriptorImpl]

'builder' @ [50:80] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList.appendWhere[ValueParameterDescriptorImpl]

'builder' @ [55:16] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList.appendWhere[ValueParameterDescriptorImpl]

'parameters' @ [59:17] ==> public final val parameters: List<TypeParameter> defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[PropertyDescriptorImpl]

'isEmpty' @ [59:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'parameters' @ [61:39] ==> public final val parameters: List<TypeParameter> defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[PropertyDescriptorImpl]

'any' @ [61:50] ==> public inline fun <T> Iterable<TypeParameter>.any(predicate: (TypeParameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'it' @ [61:56] ==> value-parameter it: TypeParameter defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList.hasWhere.<anonymous>[ValueParameterDescriptorImpl]

'hasWhere' @ [61:59] ==> public final fun hasWhere(): Boolean defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[SimpleFunctionDescriptorImpl]

'TypeParameterList' @ [64:21] ==> public constructor TypeParameterList(parameters: List<TypeParameter>) defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[ClassConstructorDescriptorImpl]

'listOf' @ [64:39] ==> @InlineOnly public inline fun <T> listOf(): List<TypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'TypeParameter' @ [69:12] ==> public constructor TypeParameter(name: Identifier, extendsTypes: List<Type>) defined in org.jetbrains.kotlin.j2k.ast.TypeParameter[ClassConstructorDescriptorImpl]

'typeParameter' @ [69:26] ==> value-parameter typeParameter: PsiTypeParameter defined in org.jetbrains.kotlin.j2k.ast.convertTypeParameter[ValueParameterDescriptorImpl]

'declarationIdentifier' @ [69:40] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'typeParameter' @ [70:28] ==> value-parameter typeParameter: PsiTypeParameter defined in org.jetbrains.kotlin.j2k.ast.convertTypeParameter[ValueParameterDescriptorImpl]

'extendsListTypes' @ [70:42] ==> public final val PsiTypeParameter.extendsListTypes: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>)[MyPropertyDescriptor]

'map' @ [70:59] ==> public inline fun <T, R> Array<out (PsiClassType..PsiClassType?)>.map(transform: ((PsiClassType..PsiClassType?)) -> Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClassType..com.intellij.psi.PsiClassType?)
    <R> -> Type

'typeConverter' @ [70:65] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertType' @ [70:79] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'it' @ [70:91] ==> value-parameter it: (PsiClassType..PsiClassType?) defined in org.jetbrains.kotlin.j2k.ast.convertTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'assignPrototype' @ [70:98] ==> public fun <TElement : Element> TypeParameter.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): TypeParameter defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> TypeParameter

'typeParameter' @ [70:114] ==> value-parameter typeParameter: PsiTypeParameter defined in org.jetbrains.kotlin.j2k.ast.convertTypeParameter[ValueParameterDescriptorImpl]

'if (typeParameterList != null)
        TypeParameterList(typeParameterList.typeParameters.toList().map { convertTypeParameter(it) }).assignPrototype(typeParameterList)
    else
        TypeParameterList.Empty' @ [74:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeParameterList, elseBranch: TypeParameterList): TypeParameterList[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeParameterList

'typeParameterList' @ [74:16] ==> value-parameter typeParameterList: PsiTypeParameterList? defined in org.jetbrains.kotlin.j2k.ast.convertTypeParameterList[ValueParameterDescriptorImpl]

'TypeParameterList' @ [75:9] ==> public constructor TypeParameterList(parameters: List<TypeParameter>) defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[ClassConstructorDescriptorImpl]

'typeParameterList' @ [75:27] ==> value-parameter typeParameterList: PsiTypeParameterList? defined in org.jetbrains.kotlin.j2k.ast.convertTypeParameterList[ValueParameterDescriptorImpl]

'typeParameters' @ [75:45] ==> public final val PsiTypeParameterList.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'toList' @ [75:60] ==> public fun <T> Array<out (PsiTypeParameter..PsiTypeParameter?)>.toList(): List<(PsiTypeParameter..PsiTypeParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)

'map' @ [75:69] ==> public inline fun <T, R> Iterable<(PsiTypeParameter..PsiTypeParameter?)>.map(transform: ((PsiTypeParameter..PsiTypeParameter?)) -> TypeParameter): List<TypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)
    <R> -> TypeParameter

'convertTypeParameter' @ [75:75] ==> private fun Converter.convertTypeParameter(typeParameter: PsiTypeParameter): TypeParameter defined in org.jetbrains.kotlin.j2k.ast in file TypeParameters.kt[SimpleFunctionDescriptorImpl]

'it' @ [75:96] ==> value-parameter it: (PsiTypeParameter..PsiTypeParameter?) defined in org.jetbrains.kotlin.j2k.ast.convertTypeParameterList.<anonymous>[ValueParameterDescriptorImpl]

'assignPrototype' @ [75:103] ==> public fun <TElement : Element> TypeParameterList.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): TypeParameterList defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> TypeParameterList

'typeParameterList' @ [75:119] ==> value-parameter typeParameterList: PsiTypeParameterList? defined in org.jetbrains.kotlin.j2k.ast.convertTypeParameterList[ValueParameterDescriptorImpl]

'Empty' @ [77:27] ==> public final val Empty: TypeParameterList defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList.Companion[PropertyDescriptorImpl]

