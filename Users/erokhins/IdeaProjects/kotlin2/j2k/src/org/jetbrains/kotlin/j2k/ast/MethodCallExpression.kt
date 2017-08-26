'Expression' @ [28:5] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [31:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [31:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [31:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[LazyClassReceiverParameterDescriptor]

'methodExpression' @ [31:37] ==> public final val methodExpression: Expression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[PropertyDescriptorImpl]

'append' @ [31:55] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'typeArguments' @ [31:62] ==> public final val typeArguments: List<Type> defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[PropertyDescriptorImpl]

'builder' @ [32:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [32:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'argumentList' @ [32:24] ==> public final val argumentList: ArgumentList defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[PropertyDescriptorImpl]

'ArgumentList' @ [39:46] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.ArgumentList[FakeCallableDescriptorForObject]

'withNoPrototype' @ [39:59] ==> public final fun withNoPrototype(vararg arguments: Expression): ArgumentList defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion[SimpleFunctionDescriptorImpl]

'emptyList' @ [40:45] ==> public fun <T> emptyList(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'build' @ [42:35] ==> public final fun build(receiver: Expression?, methodName: String, argumentList: ArgumentList, typeArguments: List<Type>, isNullable: Boolean, dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'receiver' @ [42:41] ==> value-parameter receiver: Expression? defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNonNull[ValueParameterDescriptorImpl]

'methodName' @ [42:51] ==> value-parameter methodName: String defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNonNull[ValueParameterDescriptorImpl]

'argumentList' @ [42:63] ==> value-parameter argumentList: ArgumentList = ... defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNonNull[ValueParameterDescriptorImpl]

'typeArguments' @ [42:77] ==> value-parameter typeArguments: List<Type> = ... defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNonNull[ValueParameterDescriptorImpl]

'dotPrototype' @ [42:99] ==> value-parameter dotPrototype: PsiElement? = ... defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNonNull[ValueParameterDescriptorImpl]

'ArgumentList' @ [47:46] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.ArgumentList[FakeCallableDescriptorForObject]

'withNoPrototype' @ [47:59] ==> public final fun withNoPrototype(vararg arguments: Expression): ArgumentList defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion[SimpleFunctionDescriptorImpl]

'emptyList' @ [48:45] ==> public fun <T> emptyList(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'build' @ [50:35] ==> public final fun build(receiver: Expression?, methodName: String, argumentList: ArgumentList, typeArguments: List<Type>, isNullable: Boolean, dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'receiver' @ [50:41] ==> value-parameter receiver: Expression? defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNullable[ValueParameterDescriptorImpl]

'methodName' @ [50:51] ==> value-parameter methodName: String defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNullable[ValueParameterDescriptorImpl]

'argumentList' @ [50:63] ==> value-parameter argumentList: ArgumentList = ... defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNullable[ValueParameterDescriptorImpl]

'typeArguments' @ [50:77] ==> value-parameter typeArguments: List<Type> = ... defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNullable[ValueParameterDescriptorImpl]

'dotPrototype' @ [50:98] ==> value-parameter dotPrototype: PsiElement? = ... defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.buildNullable[ValueParameterDescriptorImpl]

'Identifier' @ [60:30] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [60:41] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'methodName' @ [60:57] ==> value-parameter methodName: String defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[ValueParameterDescriptorImpl]

'if (receiver != null)
                QualifiedExpression(receiver, identifier, dotPrototype).assignNoPrototype()
            else
                identifier' @ [61:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression, elseBranch: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression

'receiver' @ [61:40] ==> value-parameter receiver: Expression? defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[ValueParameterDescriptorImpl]

'QualifiedExpression' @ [62:17] ==> public constructor QualifiedExpression(qualifier: Expression, identifier: Expression, dotPrototype: PsiElement?) defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[ClassConstructorDescriptorImpl]

'receiver' @ [62:37] ==> value-parameter receiver: Expression? defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[ValueParameterDescriptorImpl]

'identifier' @ [62:47] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[LocalVariableDescriptor]

'dotPrototype' @ [62:59] ==> value-parameter dotPrototype: PsiElement? = ... defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[ValueParameterDescriptorImpl]

'assignNoPrototype' @ [62:73] ==> public fun <TElement : Element> QualifiedExpression.assignNoPrototype(): QualifiedExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> QualifiedExpression

'identifier' @ [64:17] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[LocalVariableDescriptor]

'MethodCallExpression' @ [65:20] ==> public constructor MethodCallExpression(methodExpression: Expression, argumentList: ArgumentList, typeArguments: List<Type>, isNullable: Boolean) defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[ClassConstructorDescriptorImpl]

'methodExpression' @ [65:41] ==> val methodExpression: Expression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[LocalVariableDescriptor]

'argumentList' @ [65:59] ==> value-parameter argumentList: ArgumentList defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[ValueParameterDescriptorImpl]

'typeArguments' @ [65:73] ==> value-parameter typeArguments: List<Type> defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[ValueParameterDescriptorImpl]

'isNullable' @ [65:88] ==> value-parameter isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion.build[ValueParameterDescriptorImpl]

