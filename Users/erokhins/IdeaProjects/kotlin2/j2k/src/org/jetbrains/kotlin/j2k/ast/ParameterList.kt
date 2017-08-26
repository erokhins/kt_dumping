'Element' @ [27:5] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'lPar' @ [29:9] ==> public final val lPar: LPar? defined in org.jetbrains.kotlin.j2k.ast.ParameterList[PropertyDescriptorImpl]

'let' @ [29:15] ==> @InlineOnly public inline fun <T, R> LPar.let(block: (LPar) -> CodeBuilder): CodeBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LPar
    <R> -> CodeBuilder

'builder' @ [29:21] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ParameterList.generateCode[ValueParameterDescriptorImpl]

'append' @ [29:29] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'it' @ [29:36] ==> value-parameter it: LPar defined in org.jetbrains.kotlin.j2k.ast.ParameterList.generateCode.<anonymous>[ValueParameterDescriptorImpl]

'builder' @ [31:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ParameterList.generateCode[ValueParameterDescriptorImpl]

'append' @ [31:17] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'parameters' @ [31:24] ==> public final val parameters: List<Parameter> defined in org.jetbrains.kotlin.j2k.ast.ParameterList[PropertyDescriptorImpl]

'rPar' @ [33:9] ==> public final val rPar: RPar? defined in org.jetbrains.kotlin.j2k.ast.ParameterList[PropertyDescriptorImpl]

'let' @ [33:15] ==> @InlineOnly public inline fun <T, R> RPar.let(block: (RPar) -> CodeBuilder): CodeBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RPar
    <R> -> CodeBuilder

'builder' @ [33:21] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ParameterList.generateCode[ValueParameterDescriptorImpl]

'append' @ [33:29] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'it' @ [33:36] ==> value-parameter it: RPar defined in org.jetbrains.kotlin.j2k.ast.ParameterList.generateCode.<anonymous>[ValueParameterDescriptorImpl]

'ParameterList' @ [38:20] ==> public constructor ParameterList(parameters: List<Parameter>, lPar: LPar?, rPar: RPar?) defined in org.jetbrains.kotlin.j2k.ast.ParameterList[ClassConstructorDescriptorImpl]

'parameters' @ [38:34] ==> value-parameter parameters: List<Parameter> defined in org.jetbrains.kotlin.j2k.ast.ParameterList.Companion.withNoPrototype[ValueParameterDescriptorImpl]

'withPrototype' @ [38:51] ==> public final fun withPrototype(element: PsiElement?): LPar defined in org.jetbrains.kotlin.j2k.ast.LPar.Companion[SimpleFunctionDescriptorImpl]

'withPrototype' @ [38:77] ==> public final fun withPrototype(element: PsiElement?): RPar defined in org.jetbrains.kotlin.j2k.ast.RPar.Companion[SimpleFunctionDescriptorImpl]

'assignNoPrototype' @ [38:98] ==> public fun <TElement : Element> ParameterList.assignNoPrototype(): ParameterList defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ParameterList

'Element' @ [44:36] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'builder' @ [46:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.LPar.generateCode[ValueParameterDescriptorImpl]

'append' @ [46:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'LPar' @ [50:51] ==> private constructor LPar() defined in org.jetbrains.kotlin.j2k.ast.LPar[ClassConstructorDescriptorImpl]

'assignPrototype' @ [50:58] ==> public fun <TElement : Element> LPar.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): LPar defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LPar

'element' @ [50:74] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.j2k.ast.LPar.Companion.withPrototype[ValueParameterDescriptorImpl]

'LINE_BREAKS' @ [50:112] ==> public final val LINE_BREAKS: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'Element' @ [54:36] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'builder' @ [56:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.RPar.generateCode[ValueParameterDescriptorImpl]

'append' @ [56:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'RPar' @ [60:51] ==> private constructor RPar() defined in org.jetbrains.kotlin.j2k.ast.RPar[ClassConstructorDescriptorImpl]

'assignPrototype' @ [60:58] ==> public fun <TElement : Element> RPar.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): RPar defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> RPar

'element' @ [60:74] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.j2k.ast.RPar.Companion.withPrototype[ValueParameterDescriptorImpl]

'LINE_BREAKS' @ [60:112] ==> public final val LINE_BREAKS: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

