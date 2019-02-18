package org.pbreakers;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Personne {

    public String nom_complet;
    public List<Adresse> adresses = new List<Adresse>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Adresse> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Adresse adresse) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Adresse> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Adresse> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Adresse get(int index) {
            return null;
        }

        @Override
        public Adresse set(int index, Adresse element) {
            return null;
        }

        @Override
        public void add(int index, Adresse element) {

        }

        @Override
        public Adresse remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Adresse> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Adresse> listIterator(int index) {
            return null;
        }

        @Override
        public List<Adresse> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    public List<Telephone> phones = new List<Telephone>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Telephone> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Telephone telephone) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Telephone> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Telephone> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Telephone get(int index) {
            return null;
        }

        @Override
        public Telephone set(int index, Telephone element) {
            return null;
        }

        @Override
        public void add(int index, Telephone element) {

        }

        @Override
        public Telephone remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Telephone> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Telephone> listIterator(int index) {
            return null;
        }

        @Override
        public List<Telephone> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    public List<PageWeb> website = new List<PageWeb>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<PageWeb> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(PageWeb pageWeb) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends PageWeb> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends PageWeb> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public PageWeb get(int index) {
            return null;
        }

        @Override
        public PageWeb set(int index, PageWeb element) {
            return null;
        }

        @Override
        public void add(int index, PageWeb element) {

        }

        @Override
        public PageWeb remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<PageWeb> listIterator() {
            return null;
        }

        @Override
        public ListIterator<PageWeb> listIterator(int index) {
            return null;
        }

        @Override
        public List<PageWeb> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    public List<Email> email = new List<Email>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Email> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Email email) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Email> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Email> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Email get(int index) {
            return null;
        }

        @Override
        public Email set(int index, Email element) {
            return null;
        }

        @Override
        public void add(int index, Email element) {

        }

        @Override
        public Email remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Email> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Email> listIterator(int index) {
            return null;
        }

        @Override
        public List<Email> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    Personne(String nom) throws ValeurErroneeException{
        if (nom.equals("")){
            throw new ValeurErroneeException(nom);
        }else{
            this.nom_complet = nom;
        }
    }
    public String getNom_complet() {
        return nom_complet;
    }

    public void setNom_complet(String nom_complet) {
        this.nom_complet = nom_complet;
    }

}
