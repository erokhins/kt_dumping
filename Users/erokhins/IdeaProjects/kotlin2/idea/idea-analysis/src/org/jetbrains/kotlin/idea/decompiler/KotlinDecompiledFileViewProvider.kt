'SingleRootFileViewProvider' @ [36:5] ==> protected/*protected and package*/ constructor SingleRootFileViewProvider(@NotNull p0: PsiManager, @NotNull p1: VirtualFile, p2: Boolean, @NotNull p3: Language) defined in com.intellij.psi.SingleRootFileViewProvider[JavaClassConstructorDescriptor]

'manager' @ [36:32] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider.<init>[ValueParameterDescriptorImpl]

'file' @ [36:41] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider.<init>[ValueParameterDescriptorImpl]

'physical' @ [36:47] ==> value-parameter physical: Boolean defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [36:72] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'LockedClearableLazyValue' @ [37:54] ==> public constructor LockedClearableLazyValue<out T : Any>(lock: Any, init: () -> String) defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : Any> -> String

'Any' @ [37:79] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'createFile' @ [38:23] ==> protected open fun createFile(project: Project, file: VirtualFile, fileType: FileType): PsiFile? defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider[SimpleFunctionDescriptorImpl]

'manager' @ [38:34] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider.<init>[ValueParameterDescriptorImpl]

'project' @ [38:42] ==> public final val PsiManager.project: Project[MyPropertyDescriptor]

'file' @ [38:51] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [38:72] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'psiFile' @ [39:20] ==> val psiFile: PsiFile? defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider.content.<anonymous>[LocalVariableDescriptor]

'text' @ [39:29] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'startPsiModification' @ [41:19] ==> public open fun startPsiModification(@Nullable p0: String?): Unit defined in com.intellij.psi.impl.DebugUtil[JavaMethodDescriptor]

'psiFile' @ [43:14] ==> val psiFile: PsiFile? defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider.content.<anonymous>[LocalVariableDescriptor]

'markInvalidated' @ [43:40] ==> public open fun markInvalidated(): Unit defined in com.intellij.psi.impl.source.PsiFileImpl[JavaMethodDescriptor]

'finishPsiModification' @ [46:23] ==> public open fun finishPsiModification(): Unit defined in com.intellij.psi.impl.DebugUtil[JavaMethodDescriptor]

'text' @ [49:9] ==> val text: String defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider.content.<anonymous>[LocalVariableDescriptor]

'invoke' @ [53:16] ==> public abstract operator fun invoke(p1: KotlinDecompiledFileViewProvider): KtDecompiledFile? defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [53:24] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider[LazyClassReceiverParameterDescriptor]

'KotlinDecompiledFileViewProvider' @ [56:50] ==> public constructor KotlinDecompiledFileViewProvider(manager: PsiManager, file: VirtualFile, physical: Boolean, factory: (KotlinDecompiledFileViewProvider) -> KtDecompiledFile?) defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider[ClassConstructorDescriptorImpl]

'manager' @ [56:83] ==> public final val KotlinDecompiledFileViewProvider.manager: PsiManager[MyPropertyDescriptor]

'copy' @ [56:92] ==> value-parameter copy: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider.createCopy[ValueParameterDescriptorImpl]

'factory' @ [56:105] ==> private final val factory: (KotlinDecompiledFileViewProvider) -> KtDecompiledFile? defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider[PropertyDescriptorImpl]

'content' @ [58:34] ==> public final val content: LockedClearableLazyValue<String> defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider[PropertyDescriptorImpl]

'get' @ [58:42] ==> public final fun get(): String defined in org.jetbrains.kotlin.utils.concurrent.block.LockedClearableLazyValue[DeserializedSimpleFunctionDescriptor]

