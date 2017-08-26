'DelegatingMemberInfoModel<T, M>' @ [33:5] ==> public constructor DelegatingMemberInfoModel<T : (PsiElement..PsiElement?), M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)>(p0: (MemberInfoModel<(T..T?), (M..M?)>..MemberInfoModel<(T..T?), (M..M?)>?)) defined in com.intellij.refactoring.classMembers.DelegatingMemberInfoModel[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> T
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> M

'ANDCombinedMemberInfoModel' @ [34:9] ==> public constructor ANDCombinedMemberInfoModel<T : (PsiElement..PsiElement?), M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)>(p0: (MemberInfoModel<(T..T?), (M..M?)>..MemberInfoModel<(T..T?), (M..M?)>?), p1: (MemberInfoModel<(T..T?), (M..M?)>..MemberInfoModel<(T..T?), (M..M?)>?)) defined in com.intellij.refactoring.classMembers.ANDCombinedMemberInfoModel[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (T..T?)
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> (M..M?)

'KotlinUsesDependencyMemberInfoModel<T, M>' @ [35:26] ==> public constructor KotlinUsesDependencyMemberInfoModel<T : KtNamedDeclaration, M : MemberInfoBase<T>>(klass: KtClassOrObject, superClass: PsiNamedElement?, recursive: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesDependencyMemberInfoModel[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> T
    <M : MemberInfoBase<T>> -> M

'klass' @ [35:68] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>[ValueParameterDescriptorImpl]

'superClass' @ [35:75] ==> value-parameter superClass: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>[ValueParameterDescriptorImpl]

'recursive' @ [35:87] ==> value-parameter recursive: Boolean defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>[ValueParameterDescriptorImpl]

'super' @ [37:39] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>.<no name provided>[LazyClassReceiverParameterDescriptor]

'checkForProblems' @ [37:45] ==> public open fun checkForProblems(@NotNull p0: M): Int defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesDependencyMemberInfoModel[JavaMethodDescriptor]

'memberInfo' @ [37:62] ==> value-parameter memberInfo: M defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>.<no name provided>.checkForProblems[ValueParameterDescriptorImpl]

'problem' @ [38:29] ==> val problem: Int defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>.<no name provided>.checkForProblems[LocalVariableDescriptor]

'OK' @ [38:56] ==> public const final val OK: Int defined in com.intellij.refactoring.classMembers.MemberInfoModel[JavaPropertyDescriptor]

'OK' @ [38:83] ==> public const final val OK: Int defined in com.intellij.refactoring.classMembers.MemberInfoModel[JavaPropertyDescriptor]

'memberInfo' @ [40:38] ==> value-parameter memberInfo: M defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>.<no name provided>.checkForProblems[ValueParameterDescriptorImpl]

'member' @ [40:49] ==> public final val <T : (PsiElement..PsiElement?)> MemberInfoBase<T>.member: (T..T?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> T

'invoke' @ [41:29] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'member' @ [41:58] ==> val member: (T..T?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>.<no name provided>.checkForProblems[LocalVariableDescriptor]

'OK' @ [41:90] ==> public const final val OK: Int defined in com.intellij.refactoring.classMembers.MemberInfoModel[JavaPropertyDescriptor]

'problem' @ [43:32] ==> val problem: Int defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>.<no name provided>.checkForProblems[LocalVariableDescriptor]

'KotlinInterfaceDependencyMemberInfoModel' @ [46:17] ==> public constructor KotlinInterfaceDependencyMemberInfoModel<T : KtNamedDeclaration, M : MemberInfoBase<T>>(aClass: KtClassOrObject) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceDependencyMemberInfoModel[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> T
    <M : MemberInfoBase<T>> -> M

'klass' @ [46:64] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.<init>[ValueParameterDescriptorImpl]

'Suppress' @ [48:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'delegatingTarget' @ [50:11] ==> public final val <T : KtNamedDeclaration, M : MemberInfoBase<T>> KotlinUsesAndInterfacesDependencyMemberInfoModel<T, M>.delegatingTarget: raw (MemberInfoModel<(PsiElement..PsiElement?), (MemberInfoBase<*>..MemberInfoBase<*>?)>..MemberInfoModel<*, out (MemberInfoBase<*>..MemberInfoBase<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : KtNamedDeclaration> -> T
    <M : MemberInfoBase<T>> -> M

'model1' @ [50:65] ==> public final val <T : (PsiElement..PsiElement?), M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> ANDCombinedMemberInfoModel<T, M>.model1: (MemberInfoModel<(T..T?), (M..M?)>..MemberInfoModel<(T..T?), (M..M?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> T
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> M

'setSuperClass' @ [50:129] ==> public open fun setSuperClass(p0: (PsiNamedElement..PsiNamedElement?)): Unit defined in com.intellij.refactoring.util.classMembers.UsesDependencyMemberInfoModel[JavaMethodDescriptor]

'superClass' @ [50:143] ==> value-parameter superClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinUsesAndInterfacesDependencyMemberInfoModel.setSuperClass[ValueParameterDescriptorImpl]

