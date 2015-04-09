require gtk+3.inc

MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"

SRC_URI = "http://ftp.gnome.org/pub/gnome/sources/gtk+/${MAJ_VER}/gtk+-${PV}.tar.xz \
           file://hardcoded_libtool.patch \
           file://Remove-includedir-poisoning-from-configure.ac.patch \
          "

SRC_URI[md5sum] = "11c97ce2527956e0ddb5ad5b236e4572"
SRC_URI[sha256sum] = "ce617318fe18092383cf6ed5d8c688a95a97f2d4c68481317a6a531e288c26ea"

S = "${WORKDIR}/gtk+-${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
                    file://gtk/gtk.h;endline=25;md5=1d8dc0fccdbfa26287a271dce88af737 \
                    file://gdk/gdk.h;endline=25;md5=c920ce39dc88c6f06d3e7c50e08086f2 \
                    file://tests/testgtk.c;endline=25;md5=cb732daee1d82af7a2bf953cf3cf26f1"
