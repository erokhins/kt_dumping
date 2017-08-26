'findAllRecursively' @ [43:18] ==> @NotNull public open fun <T : (Any..Any?)> findAllRecursively(@Nullable p0: DataNode<*>?, @NotNull p1: Key<(JavaModuleModel..JavaModuleModel?)>): (MutableCollection<(DataNode<(JavaModuleModel..JavaModuleModel?)>..DataNode<(JavaModuleModel..JavaModuleModel?)>?)>..Collection<(DataNode<(JavaModuleModel..JavaModuleModel?)>..DataNode<(JavaModuleModel..JavaModuleModel?)>?)>) defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.android.tools.idea.gradle.project.model.JavaModuleModel..com.android.tools.idea.gradle.project.model.JavaModuleModel?)

'moduleData' @ [43:37] ==> value-parameter moduleData: DataNode<*> defined in org.jetbrains.kotlin.android.configure.PlatformAndroidGradleDetector.getResolvedKotlinStdlibVersionByModuleData[ValueParameterDescriptorImpl]

'JAVA_MODULE_MODEL' @ [43:68] ==> @NotNull public final val JAVA_MODULE_MODEL: Key<(JavaModuleModel..JavaModuleModel?)> defined in com.android.tools.idea.gradle.project.sync.idea.data.service.AndroidProjectKeys[JavaPropertyDescriptor]

'asSequence' @ [43:87] ==> public fun <T> Iterable<(DataNode<(JavaModuleModel..JavaModuleModel?)>..DataNode<(JavaModuleModel..JavaModuleModel?)>?)>.asSequence(): Sequence<(DataNode<(JavaModuleModel..JavaModuleModel?)>..DataNode<(JavaModuleModel..JavaModuleModel?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.externalSystem.model.DataNode<(com.android.tools.idea.gradle.project.model.JavaModuleModel..com.android.tools.idea.gradle.project.model.JavaModuleModel?)>..com.intellij.openapi.externalSystem.model.DataNode<(com.android.tools.idea.gradle.project.model.JavaModuleModel..com.android.tools.idea.gradle.project.model.JavaModuleModel?)>?)

'flatMap' @ [44:18] ==> public fun <T, R> Sequence<(DataNode<(JavaModuleModel..JavaModuleModel?)>..DataNode<(JavaModuleModel..JavaModuleModel?)>?)>.flatMap(transform: ((DataNode<(JavaModuleModel..JavaModuleModel?)>..DataNode<(JavaModuleModel..JavaModuleModel?)>?)) -> Sequence<(JarLibraryDependency..JarLibraryDependency?)>): Sequence<(JarLibraryDependency..JarLibraryDependency?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.externalSystem.model.DataNode<(com.android.tools.idea.gradle.project.model.JavaModuleModel..com.android.tools.idea.gradle.project.model.JavaModuleModel?)>..com.intellij.openapi.externalSystem.model.DataNode<(com.android.tools.idea.gradle.project.model.JavaModuleModel..com.android.tools.idea.gradle.project.model.JavaModuleModel?)>?)
    <R> -> (com.android.tools.idea.gradle.model.java.JarLibraryDependency..com.android.tools.idea.gradle.model.java.JarLibraryDependency?)

'it' @ [44:28] ==> value-parameter it: (DataNode<(JavaModuleModel..JavaModuleModel?)>..DataNode<(JavaModuleModel..JavaModuleModel?)>?) defined in org.jetbrains.kotlin.android.configure.PlatformAndroidGradleDetector.getResolvedKotlinStdlibVersionByModuleData.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [44:31] ==> public final val <T : (Any..Any?)> DataNode<(JavaModuleModel..JavaModuleModel?)>.data: JavaModuleModel[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.android.tools.idea.gradle.project.model.JavaModuleModel..com.android.tools.idea.gradle.project.model.JavaModuleModel?)

'jarLibraryDependencies' @ [44:36] ==> public final val JavaModuleModel.jarLibraryDependencies: (MutableCollection<(JarLibraryDependency..JarLibraryDependency?)>..Collection<(JarLibraryDependency..JarLibraryDependency?)>)[MyPropertyDescriptor]

'asSequence' @ [44:59] ==> public fun <T> Iterable<(JarLibraryDependency..JarLibraryDependency?)>.asSequence(): Sequence<(JarLibraryDependency..JarLibraryDependency?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.android.tools.idea.gradle.model.java.JarLibraryDependency..com.android.tools.idea.gradle.model.java.JarLibraryDependency?)

'forEach' @ [45:18] ==> public inline fun <T> Sequence<(JarLibraryDependency..JarLibraryDependency?)>.forEach(action: ((JarLibraryDependency..JarLibraryDependency?)) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.android.tools.idea.gradle.model.java.JarLibraryDependency..com.android.tools.idea.gradle.model.java.JarLibraryDependency?)

'it' @ [46:39] ==> value-parameter it: (JarLibraryDependency..JarLibraryDependency?) defined in org.jetbrains.kotlin.android.configure.PlatformAndroidGradleDetector.getResolvedKotlinStdlibVersionByModuleData.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [46:42] ==> public final val JarLibraryDependency.name: String[MyPropertyDescriptor]

'libraryIds' @ [47:39] ==> value-parameter libraryIds: List<String> defined in org.jetbrains.kotlin.android.configure.PlatformAndroidGradleDetector.getResolvedKotlinStdlibVersionByModuleData[ValueParameterDescriptorImpl]

'libraryId' @ [48:40] ==> val libraryId: String defined in org.jetbrains.kotlin.android.configure.PlatformAndroidGradleDetector.getResolvedKotlinStdlibVersionByModuleData.<anonymous>[LocalVariableDescriptor]

'libraryName' @ [49:29] ==> val libraryName: String defined in org.jetbrains.kotlin.android.configure.PlatformAndroidGradleDetector.getResolvedKotlinStdlibVersionByModuleData.<anonymous>[LocalVariableDescriptor]

'startsWith' @ [49:41] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [49:52] ==> val prefix: String defined in org.jetbrains.kotlin.android.configure.PlatformAndroidGradleDetector.getResolvedKotlinStdlibVersionByModuleData.<anonymous>[LocalVariableDescriptor]

'libraryName' @ [49:68] ==> val libraryName: String defined in org.jetbrains.kotlin.android.configure.PlatformAndroidGradleDetector.getResolvedKotlinStdlibVersionByModuleData.<anonymous>[LocalVariableDescriptor]

'substringAfter' @ [49:80] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [49:95] ==> val prefix: String defined in org.jetbrains.kotlin.android.configure.PlatformAndroidGradleDetector.getResolvedKotlinStdlibVersionByModuleData.<anonymous>[LocalVariableDescriptor]

