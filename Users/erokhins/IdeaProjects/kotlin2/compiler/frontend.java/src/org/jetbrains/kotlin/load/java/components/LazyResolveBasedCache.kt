'AbstractJavaResolverCache' @ [35:63] ==> public constructor AbstractJavaResolverCache(resolveSession: ResolveSession) defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache[ClassConstructorDescriptorImpl]

'resolveSession' @ [35:89] ==> value-parameter resolveSession: ResolveSession defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache.<init>[ValueParameterDescriptorImpl]

'recordFunctionDeclarationToDescriptor' @ [38:29] ==> public open fun recordFunctionDeclarationToDescriptor(@NotNull p0: BindingTrace, @NotNull p1: PsiElement, @NotNull p2: SimpleFunctionDescriptor): Unit defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'trace' @ [38:67] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache[PropertyDescriptorImpl]

'?:' @ [38:74] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiMethod?, right: PsiMethod): PsiMethod[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiMethod

'method' @ [38:75] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache.recordMethod[ValueParameterDescriptorImpl]

'psi' @ [38:103] ==> public final val JavaMethodImpl.psi: PsiMethod[MyPropertyDescriptor]

'descriptor' @ [38:118] ==> value-parameter descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache.recordMethod[ValueParameterDescriptorImpl]

'trace' @ [42:9] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache[PropertyDescriptorImpl]

'record' @ [42:15] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(p0: (WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>?), p1: (PsiElement..PsiElement?), p2: (ConstructorDescriptor..ConstructorDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> ConstructorDescriptor

'CONSTRUCTOR' @ [42:22] ==> public final val CONSTRUCTOR: (WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'?:' @ [42:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [42:36] ==> value-parameter element: JavaElement defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache.recordConstructor[ValueParameterDescriptorImpl]

'psi' @ [42:69] ==> public final val <Psi : (PsiElement..PsiElement?)> JavaElementImpl<out (PsiElement..PsiElement?)>.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <Psi : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'descriptor' @ [42:84] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache.recordConstructor[ValueParameterDescriptorImpl]

'trace' @ [46:9] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache[PropertyDescriptorImpl]

'record' @ [46:15] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(p0: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?), p1: (PsiElement..PsiElement?), p2: (VariableDescriptor..VariableDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> VariableDescriptor

'VARIABLE' @ [46:22] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'?:' @ [46:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiField?, right: PsiField): PsiField[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiField

'field' @ [46:33] ==> value-parameter field: JavaField defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache.recordField[ValueParameterDescriptorImpl]

'psi' @ [46:59] ==> public final val JavaFieldImpl.psi: PsiField[MyPropertyDescriptor]

'descriptor' @ [46:74] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache.recordField[ValueParameterDescriptorImpl]

'trace' @ [50:9] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache[PropertyDescriptorImpl]

'record' @ [50:15] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(p0: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?), p2: (ClassDescriptor..ClassDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> ClassDescriptor

'CLASS' @ [50:22] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'?:' @ [50:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiClass?, right: PsiClass): PsiClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiClass

'javaClass' @ [50:30] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache.recordClass[ValueParameterDescriptorImpl]

'psi' @ [50:60] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'descriptor' @ [50:75] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.components.LazyResolveBasedCache.recordClass[ValueParameterDescriptorImpl]

