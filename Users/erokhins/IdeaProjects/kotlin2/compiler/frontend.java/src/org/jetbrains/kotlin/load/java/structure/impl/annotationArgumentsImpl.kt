'argument' @ [28:17] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'JavaClassObjectAnnotationArgumentImpl' @ [29:24] ==> public constructor JavaClassObjectAnnotationArgumentImpl(psiExpression: PsiClassObjectAccessExpression, name: Name?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassObjectAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'argument' @ [29:62] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'name' @ [29:72] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'getInstance' @ [32:39] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'argument' @ [32:51] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'project' @ [32:60] ==> public final val PsiAnnotationMemberValue.project: Project[MyPropertyDescriptor]

'constantEvaluationHelper' @ [32:69] ==> public final val JavaPsiFacade.constantEvaluationHelper: PsiConstantEvaluationHelper[MyPropertyDescriptor]

'computeConstantExpression' @ [32:94] ==> @Nullable @Contract public open fun computeConstantExpression(@Nullable p0: PsiElement?): Any? defined in com.intellij.psi.PsiConstantEvaluationHelper[JavaMethodDescriptor]

'argument' @ [32:120] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'value' @ [33:17] ==> val value: Any? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[LocalVariableDescriptor]

'JavaEnumValueAnnotationArgumentImpl' @ [34:24] ==> public constructor JavaEnumValueAnnotationArgumentImpl(psiReference: PsiReferenceExpression, name: Name?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaEnumValueAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'argument' @ [34:60] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'name' @ [34:96] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'value' @ [37:17] ==> val value: Any? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[LocalVariableDescriptor]

'argument' @ [37:34] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'JavaLiteralAnnotationArgumentImpl' @ [38:24] ==> public constructor JavaLiteralAnnotationArgumentImpl(name: Name?, value: Any?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaLiteralAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'name' @ [38:58] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'value' @ [38:64] ==> val value: Any? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[LocalVariableDescriptor]

'when (argument) {
                is PsiReferenceExpression -> JavaEnumValueAnnotationArgumentImpl(argument, name)
                is PsiArrayInitializerMemberValue -> JavaArrayAnnotationArgumentImpl(argument, name)
                is PsiAnnotation -> JavaAnnotationAsAnnotationArgumentImpl(argument, name)
                else -> throw UnsupportedOperationException("Unsupported annotation argument type: " + argument)
            }' @ [41:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JavaAnnotationArgument, entry1: JavaAnnotationArgument, entry2: JavaAnnotationArgument, entry3: JavaAnnotationArgument): JavaAnnotationArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JavaAnnotationArgument

'argument' @ [41:26] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'JavaEnumValueAnnotationArgumentImpl' @ [42:46] ==> public constructor JavaEnumValueAnnotationArgumentImpl(psiReference: PsiReferenceExpression, name: Name?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaEnumValueAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'argument' @ [42:82] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'name' @ [42:92] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'JavaArrayAnnotationArgumentImpl' @ [43:54] ==> public constructor JavaArrayAnnotationArgumentImpl(psiValue: PsiArrayInitializerMemberValue, name: Name?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaArrayAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'argument' @ [43:86] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'name' @ [43:96] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'JavaAnnotationAsAnnotationArgumentImpl' @ [44:37] ==> public constructor JavaAnnotationAsAnnotationArgumentImpl(psiAnnotation: PsiAnnotation, name: Name?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationAsAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'argument' @ [44:76] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'name' @ [44:86] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [45:31] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [45:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'argument' @ [45:104] ==> value-parameter argument: PsiAnnotationMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory.create[ValueParameterDescriptorImpl]

'JavaAnnotationArgumentImpl' @ [59:5] ==> public constructor JavaAnnotationArgumentImpl(name: Name?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'name' @ [59:32] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaArrayAnnotationArgumentImpl.<init>[ValueParameterDescriptorImpl]

'psiValue' @ [60:34] ==> private final val psiValue: PsiArrayInitializerMemberValue defined in org.jetbrains.kotlin.load.java.structure.impl.JavaArrayAnnotationArgumentImpl[PropertyDescriptorImpl]

'initializers' @ [60:43] ==> public final val PsiArrayInitializerMemberValue.initializers: (Array<(PsiAnnotationMemberValue..PsiAnnotationMemberValue?)>..Array<out (PsiAnnotationMemberValue..PsiAnnotationMemberValue?)>)[MyPropertyDescriptor]

'map' @ [60:56] ==> public inline fun <T, R> Array<out (PsiAnnotationMemberValue..PsiAnnotationMemberValue?)>.map(transform: ((PsiAnnotationMemberValue..PsiAnnotationMemberValue?)) -> JavaAnnotationArgument): List<JavaAnnotationArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotationMemberValue..com.intellij.psi.PsiAnnotationMemberValue?)
    <R> -> JavaAnnotationArgument

'JavaAnnotationArgumentImpl' @ [60:62] ==> public companion object Factory defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl[FakeCallableDescriptorForObject]

'create' @ [60:89] ==> public final fun create(argument: PsiAnnotationMemberValue, name: Name?): JavaAnnotationArgument defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl.Factory[SimpleFunctionDescriptorImpl]

'it' @ [60:96] ==> value-parameter it: (PsiAnnotationMemberValue..PsiAnnotationMemberValue?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaArrayAnnotationArgumentImpl.getElements.<anonymous>[ValueParameterDescriptorImpl]

'JavaAnnotationArgumentImpl' @ [66:5] ==> public constructor JavaAnnotationArgumentImpl(name: Name?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'name' @ [66:32] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaEnumValueAnnotationArgumentImpl.<init>[ValueParameterDescriptorImpl]

'psiReference' @ [68:23] ==> private final val psiReference: PsiReferenceExpression defined in org.jetbrains.kotlin.load.java.structure.impl.JavaEnumValueAnnotationArgumentImpl[PropertyDescriptorImpl]

'resolve' @ [68:36] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'when (element) {
            null -> null
            is PsiEnumConstant -> JavaFieldImpl(element)
            else -> throw IllegalStateException("Reference argument should be an enum value, but was $element: ${element.text}")
        }' @ [69:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JavaField?, entry1: JavaField?, entry2: JavaField?): JavaField?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JavaField?

'element' @ [69:22] ==> val element: PsiElement? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaEnumValueAnnotationArgumentImpl.resolve[LocalVariableDescriptor]

'JavaFieldImpl' @ [71:35] ==> public constructor JavaFieldImpl(@NotNull psiField: PsiField) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaFieldImpl[JavaClassConstructorDescriptor]

'element' @ [71:49] ==> val element: PsiElement? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaEnumValueAnnotationArgumentImpl.resolve[LocalVariableDescriptor]

'IllegalStateException' @ [72:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'element' @ [72:103] ==> val element: PsiElement? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaEnumValueAnnotationArgumentImpl.resolve[LocalVariableDescriptor]

'element' @ [72:114] ==> val element: PsiElement? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaEnumValueAnnotationArgumentImpl.resolve[LocalVariableDescriptor]

'text' @ [72:122] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'psiReference' @ [77:17] ==> private final val psiReference: PsiReferenceExpression defined in org.jetbrains.kotlin.load.java.structure.impl.JavaEnumValueAnnotationArgumentImpl[PropertyDescriptorImpl]

'referenceName' @ [77:30] ==> public final val PsiReferenceExpression.referenceName: String?[MyPropertyDescriptor]

'let' @ [77:45] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Name): Name defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Name

'Name' @ [77:49] ==> private constructor Name(@NotNull p0: String, p1: Boolean) defined in org.jetbrains.kotlin.name.Name[JavaClassConstructorDescriptor]

'JavaAnnotationArgumentImpl' @ [83:5] ==> public constructor JavaAnnotationArgumentImpl(name: Name?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'name' @ [83:32] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassObjectAnnotationArgumentImpl.<init>[ValueParameterDescriptorImpl]

'create' @ [84:53] ==> @NotNull public open fun create(@NotNull psiType: PsiType): JavaTypeImpl<*> defined in org.jetbrains.kotlin.load.java.structure.impl.JavaTypeImpl[JavaMethodDescriptor]

'psiExpression' @ [84:60] ==> private final val psiExpression: PsiClassObjectAccessExpression defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassObjectAnnotationArgumentImpl[PropertyDescriptorImpl]

'operand' @ [84:74] ==> public final val PsiClassObjectAccessExpression.operand: PsiTypeElement[MyPropertyDescriptor]

'type' @ [84:82] ==> public final val PsiTypeElement.type: PsiType[MyPropertyDescriptor]

'JavaAnnotationArgumentImpl' @ [90:5] ==> public constructor JavaAnnotationArgumentImpl(name: Name?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationArgumentImpl[ClassConstructorDescriptorImpl]

'name' @ [90:32] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationAsAnnotationArgumentImpl.<init>[ValueParameterDescriptorImpl]

'JavaAnnotationImpl' @ [91:36] ==> public constructor JavaAnnotationImpl(@NotNull psiAnnotation: PsiAnnotation) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationImpl[JavaClassConstructorDescriptor]

'psiAnnotation' @ [91:55] ==> private final val psiAnnotation: PsiAnnotation defined in org.jetbrains.kotlin.load.java.structure.impl.JavaAnnotationAsAnnotationArgumentImpl[PropertyDescriptorImpl]

