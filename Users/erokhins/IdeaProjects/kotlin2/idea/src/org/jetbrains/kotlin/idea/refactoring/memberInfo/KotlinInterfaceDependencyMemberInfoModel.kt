'DependencyMemberInfoModel<T, M>' @ [29:5] ==> public constructor DependencyMemberInfoModel<T : (PsiElement..PsiElement?), M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)>(p0: (MemberDependencyGraph<(T..T?), (M..M?)>..MemberDependencyGraph<(T..T?), (M..M?)>?), p1: Int) defined in com.intellij.refactoring.classMembers.DependencyMemberInfoModel[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> T
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> M

'KotlinInterfaceMemberDependencyGraph' @ [29:37] ==> public constructor KotlinInterfaceMemberDependencyGraph<T : KtNamedDeclaration, M : MemberInfoBase<T>>(klass: KtClassOrObject) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> T
    <M : MemberInfoBase<T>> -> M

'aClass' @ [29:80] ==> value-parameter aClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceDependencyMemberInfoModel.<init>[ValueParameterDescriptorImpl]

'WARNING' @ [29:105] ==> public const final val WARNING: Int defined in com.intellij.refactoring.classMembers.MemberInfoModel[JavaPropertyDescriptor]

'setTooltipProvider' @ [31:9] ==> public final fun setTooltipProvider(p0: (((M..M?)) -> (String..String?)..(((M..M?)) -> (String..String?))?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceDependencyMemberInfoModel[MyFunctionDescriptor]

'myMemberDependencyGraph' @ [32:32] ==> protected/*protected and package*/ final var myMemberDependencyGraph: (MemberDependencyGraph<(T..T?), (M..M?)>..MemberDependencyGraph<(T..T?), (M..M?)>?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceDependencyMemberInfoModel[JavaPropertyDescriptor]

'getDependenciesOf' @ [32:56] ==> public abstract fun getDependenciesOf(p0: (T..T?)): (MutableSet<out (T..T?)>..Set<(T..T?)>?) defined in com.intellij.refactoring.classMembers.MemberDependencyGraph[JavaMethodDescriptor]

'memberInfo' @ [32:74] ==> value-parameter memberInfo: (M..M?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceDependencyMemberInfoModel.<init>.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [32:85] ==> public final val <T : (PsiElement..PsiElement?)> MemberInfoBase<T>.member: (T..T?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> T

'ifEmpty' @ [32:93] ==> public inline fun <T, C : Collection<(T..T?)>> MutableSet<out (T..T?)>.ifEmpty(body: () -> MutableSet<out (T..T?)>): MutableSet<out (T..T?)> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)
    <C : Collection<T>> -> MutableSet<out (T..T?)>

'buildString' @ [33:13] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [34:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'message' @ [34:42] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'dependencies' @ [34:104] ==> val dependencies: MutableSet<out (T..T?)> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceDependencyMemberInfoModel.<init>.<anonymous>[LocalVariableDescriptor]

'size' @ [34:117] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'append' @ [35:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'dependencies' @ [36:17] ==> val dependencies: MutableSet<out (T..T?)> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceDependencyMemberInfoModel.<init>.<anonymous>[LocalVariableDescriptor]

'joinTo' @ [36:30] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<(T..T?)>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((T..T?)) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [36:37] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceDependencyMemberInfoModel.<init>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [36:45] ==> value-parameter it: (T..T?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceDependencyMemberInfoModel.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [36:48] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

