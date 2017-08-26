'Expression' @ [26:5] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [28:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.generateCode[ValueParameterDescriptorImpl]

'append' @ [28:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'lPar' @ [28:24] ==> public final val lPar: LPar defined in org.jetbrains.kotlin.j2k.ast.ArgumentList[PropertyDescriptorImpl]

'builder' @ [29:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.generateCode[ValueParameterDescriptorImpl]

'append' @ [29:17] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'expressions' @ [29:24] ==> public final val expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArgumentList[PropertyDescriptorImpl]

'builder' @ [30:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.generateCode[ValueParameterDescriptorImpl]

'append' @ [30:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'rPar' @ [30:24] ==> public final val rPar: RPar defined in org.jetbrains.kotlin.j2k.ast.ArgumentList[PropertyDescriptorImpl]

'ArgumentList' @ [35:20] ==> public constructor ArgumentList(expressions: List<Expression>, lPar: LPar, rPar: RPar) defined in org.jetbrains.kotlin.j2k.ast.ArgumentList[ClassConstructorDescriptorImpl]

'arguments' @ [35:33] ==> value-parameter arguments: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion.withNoPrototype[ValueParameterDescriptorImpl]

'LPar' @ [35:44] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.LPar[FakeCallableDescriptorForObject]

'withPrototype' @ [35:49] ==> public final fun withPrototype(element: PsiElement?): LPar defined in org.jetbrains.kotlin.j2k.ast.LPar.Companion[SimpleFunctionDescriptorImpl]

'RPar' @ [35:70] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.RPar[FakeCallableDescriptorForObject]

'withPrototype' @ [35:75] ==> public final fun withPrototype(element: PsiElement?): RPar defined in org.jetbrains.kotlin.j2k.ast.RPar.Companion[SimpleFunctionDescriptorImpl]

'assignNoPrototype' @ [35:96] ==> public fun <TElement : Element> ArgumentList.assignNoPrototype(): ArgumentList defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ArgumentList

'withNoPrototype' @ [38:75] ==> public final fun withNoPrototype(arguments: List<Expression>): ArgumentList defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion[SimpleFunctionDescriptorImpl]

'arguments' @ [38:91] ==> value-parameter vararg arguments: Expression defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion.withNoPrototype[ValueParameterDescriptorImpl]

'asList' @ [38:101] ==> public fun <T> Array<out Expression>.asList(): List<Expression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Expression

